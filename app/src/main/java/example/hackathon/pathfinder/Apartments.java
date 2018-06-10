package example.hackathon.pathfinder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import example.hackathon.pathfinder.airbnbmodel.AirBnbModel;
import example.hackathon.pathfinder.airbnbmodel.SearchResult;
import retrofit2.Response;

public class Apartments extends AppCompatActivity {
    private static final String AIRBNB_CLIENT_ID = "3092nxybyb0otqw18e8nh5nty";
    private static final String CURRENCY ="USD";
    private static final String FORMAT_AIRBNB = "for_search_results_with_minimal_pricing";
    TextView apartmentCountTxt;
    List<SearchResult> apartments;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    AirbnbAdapter airbnbAdapter;

    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    private final static String EXTRA_LOCATION = "EXTRA_LOCATION";
    private final static String EXTRA_PRICE = "EXTRA_PRICE";

    public static Intent apptsIntent(Context context, String location, int price){

        Intent apartmentsIntent = new Intent(context, Apartments.class);
        apartmentsIntent.putExtra(EXTRA_LOCATION, location);
        apartmentsIntent.putExtra(EXTRA_PRICE, price);
        return apartmentsIntent;
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apps_list);
        Intent intent = getIntent();
        //final String location = intent.getStringExtra("EXTRA_LOCATION");
        //final int price_max = intent.getStringExtra("EXTRA_PRICE");;
        final String location = "Paris";
        final int price_max = 100;

        apartmentCountTxt = findViewById(R.id.apartments_count);
        apartments = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.appts_recycle_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        final int limit = 50;
        final int price_min = 0;
        final int sort = 1;
        final int priceDelta = 10;

        executor.execute(new Runnable() {
            @Override
            public void run() {
                fetchData(location,limit,price_min,price_max,sort,priceDelta);
            }
        });
    }// end of onCreate

    private void fetchData(String location, int limit,
                           int price_min, int price_max,
                           int sort, int priceDelta ) {
        final List<SearchResult> searchResult = new ArrayList<>();

        int n = price_max/priceDelta;
        int fourStars = 4;

        try {
            outer:
            for (int i = 0; i < n; i++ ){
                int start_price =  i*priceDelta;
                int next_price = (i + 1)*priceDelta;
                Response<AirBnbModel> response = App.getAirbnbApi().getData(AIRBNB_CLIENT_ID,
                        CURRENCY, FORMAT_AIRBNB, limit, location, next_price, start_price, sort)
                        .execute();
                if (response.body() != null) {
                    for (SearchResult r: response.body().getSearchResults()){

                        String imgURL = r.getListing().getPictureUrl();
                        Float rating = r.getListing().getStarRating();
                        if (imgURL != null  && rating != null && rating >= fourStars){
                            searchResult.add(r);
                        }
                        if (searchResult.size() >= 50) {
                            break outer;
                        }
                    }

                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {
                            apartmentCountTxt.setText(" Apartments found = " + searchResult.size());
                        }
                    });
                }
            }// end of if
        } catch (IOException e) {
            e.printStackTrace();
        }


        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                apartmentCountTxt.append(" total");
                airbnbAdapter = new AirbnbAdapter(searchResult);
                recyclerView.setAdapter(airbnbAdapter);
                recyclerView.getAdapter().notifyDataSetChanged();
            }
        });

    }// end of fetchData

}

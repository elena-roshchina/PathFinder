package example.hackathon.pathfinder;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import example.hackathon.pathfinder.airbnbmodel.AirBnbModel;
import example.hackathon.pathfinder.airbnbmodel.SearchResult;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String AIRBNB_CLIENT_ID = "3092nxybyb0otqw18e8nh5nty";
    private static final String CURRENCY ="USD";
    private static final String FORMAT_AIRBNB = "for_search_results_with_minimal_pricing";
    TextView apartmentCountTxt;

    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apartmentCountTxt = findViewById(R.id.apartments_count);

        final String location = "Paris";
        final int limit = 50;
        final int price_max = 200;
        final int price_min = 0;
        final int sort = 1;
        final int priceDelta = 10;


        executor.execute(new Runnable() {
            @Override
            public void run() {
                fetchData(location,limit,price_min,price_max,sort,priceDelta);
            }
        });
    }

    private void fetchData(String location, int limit,
                           int price_min, int price_max,
                           int sort, int priceDelta ) {
        final List<SearchResult> searchResult = new ArrayList<>();

        int n = price_max/priceDelta;

        try {
            for (int i = 0; i < n; i++ ){
                int start_price =  i*priceDelta;
                int next_price = (i + 1)*priceDelta;
                Response<AirBnbModel> response = App.getAirbnbApi().getData(AIRBNB_CLIENT_ID,
                        CURRENCY, FORMAT_AIRBNB, limit, location, next_price, start_price, sort)
                        .execute();
                if (response.body() != null) {
                    searchResult.addAll(response.body().getSearchResults());

                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {
                            apartmentCountTxt.setText(" Apartments found = " + searchResult.size());
                        }
                    });
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                apartmentCountTxt.append(" total");
            }
        });

    }
}

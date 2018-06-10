package example.hackathon.pathfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import example.hackathon.pathfinder.airbnbmodel.AirBnbModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String AIRBNB_CLIENT_ID = "3092nxybyb0otqw18e8nh5nty";
    private static final String CURRENCY ="USD";
    private static final String FORMAT_AIRBNB = "for_search_results_with_minimal_pricing";
    TextView apartmentCountTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apartmentCountTxt = findViewById(R.id.apartments_count);


        String location = "Paris";
        int limit = 1;
        int price_max = 1000;
        int price_min = 0;
        int sort = 1;

        App.getAirbnbApi().getData(AIRBNB_CLIENT_ID,
                CURRENCY, FORMAT_AIRBNB,limit,location,price_max,price_min,sort)
                .enqueue(new Callback<AirBnbModel>() {
            @Override
            public void onResponse(Call<AirBnbModel> call, Response<AirBnbModel> response) {
                if (response.body() != null) {

                        Toast.makeText(MainActivity.this, "success",
                                Toast.LENGTH_SHORT).show();
                        int apartmentCount = response.body().getSearchResults().size();

                        apartmentCountTxt.append(" " +apartmentCount);

                } else {
                    Toast.makeText(MainActivity.this, "response empty",
                            Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<AirBnbModel> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(MainActivity.this, "Failure",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}

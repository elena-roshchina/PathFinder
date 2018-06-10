package example.hackathon.pathfinder;

import android.app.Application;

import example.hackathon.pathfinder.api.AirbnbApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiFactory extends Application {
    private static AirbnbApi airbnbApi;
    private static final String AIRBNB_BASE_URL = "https://api.airbnb.com";
    private static final String AIRBNB_CLIENT_ID = "3092nxybyb0otqw18e8nh5nty";

    private Retrofit retrofitAirbnb;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofitAirbnb = new Retrofit.Builder()
                .baseUrl(AIRBNB_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        airbnbApi = retrofitAirbnb.create(AirbnbApi.class);
    }

    public static AirbnbApi getAirbnbApi() {
        return airbnbApi;
    }



        }

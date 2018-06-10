package example.hackathon.pathfinder;

import android.app.Application;

import java.io.IOException;
import java.util.List;

import example.hackathon.pathfinder.airbnbmodel.AirBnbModel;
import example.hackathon.pathfinder.api.AirbnbApi;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {
    private static AirbnbApi airbnbApi;
    private static final String AIRBNB_BASE_URL = "https://api.airbnb.com";
    private static final String AIRBNB_CLIENT_ID = "3092nxybyb0otqw18e8nh5nty";

    @Override
    public void onCreate() {
        super.onCreate();


        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();


        Retrofit retrofitAirbnb;
        retrofitAirbnb = new Retrofit.Builder()
                .baseUrl(AIRBNB_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();
        airbnbApi = retrofitAirbnb.create(AirbnbApi.class);
    }

    public static AirbnbApi getAirbnbApi() {
        return airbnbApi;
    }

}

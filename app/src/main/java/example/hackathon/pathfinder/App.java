package example.hackathon.pathfinder;

import android.app.Application;

import example.hackathon.pathfinder.api.AirbnbApi;
import example.hackathon.pathfinder.api.FlightApi;
import example.hackathon.pathfinder.flight.Flight;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    private static final String TRAVELPAYOUTS_BASE_URL = "http://api.travelpayouts.com/v2/";
    private static final String TRAVELPAYOUTS_CLIENT_ID = "0e29a686b2ad016b6d43087b0f441dbe";

    public static AirbnbApi getAirbnbApi() {
        return Retrofits.airbnb;
    }
    public static FlightApi getFlightApi() { return Retrofits.flight; }
}

class Retrofits {

    private static final String AIRBNB_BASE_URL = "https://api.airbnb.com";
    private static final String TRAVELPAYOUTS_BASE_URL = "http://api.travelpayouts.com/v2/";
    private static final String TRAVELPAYOUTS_CLIENT_ID = "0e29a686b2ad016b6d43087b0f441dbe";

    static final AirbnbApi airbnb;
    static final FlightApi flight;
    static {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();

        airbnb = new Retrofit.Builder()
                .baseUrl(AIRBNB_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(AirbnbApi.class);

        flight = new Retrofit.Builder()
                .baseUrl(TRAVELPAYOUTS_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
                .create(FlightApi.class);
    }
}

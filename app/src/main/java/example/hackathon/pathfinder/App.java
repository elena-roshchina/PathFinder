package example.hackathon.pathfinder;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import example.hackathon.pathfinder.api.AirbnbApi;
import example.hackathon.pathfinder.api.AutoCompleteApi;
import example.hackathon.pathfinder.api.FlightApi;
import example.hackathon.pathfinder.autocomplete.AutoCompleteResult;
import example.hackathon.pathfinder.autocomplete.AutoCompleteResults;
import example.hackathon.pathfinder.flight.Flight;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    public static AutoCompleteApi getAutoCompleteApi(){ return Retrofits.autocomplete; }

    public static AirbnbApi getAirbnbApi() {
        return Retrofits.airbnb;
    }
    public static FlightApi getFlightApi() { return Retrofits.flight; }
}

class Retrofits {

    private static final String AUTOCOMPLETE_BASE_URL = "http://autocomplete.travelpayouts.com";

    private static final String AIRBNB_BASE_URL = "https://api.airbnb.com";
    private static final String AIRBNB_CLIENT_ID = "3092nxybyb0otqw18e8nh5nty";

    private static final String TRAVELPAYOUTS_BASE_URL = "http://api.travelpayouts.com/v2/";
    private static final String TRAVELPAYOUTS_CLIENT_ID = "0e29a686b2ad016b6d43087b0f441dbe";

    private Context context;

    static final AutoCompleteApi autocomplete;

    static final AirbnbApi airbnb;
    static final FlightApi flight;

    public Retrofits(Context context){
        this.context = context;
    }

    static {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();

        autocomplete = new Retrofit.Builder()
                .baseUrl(AUTOCOMPLETE_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(AutoCompleteApi.class);

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

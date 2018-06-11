package example.hackathon.pathfinder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import example.hackathon.pathfinder.flight.Flight;
import example.hackathon.pathfinder.flight.FlightResults;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class FlightActivity extends AppCompatActivity {

    private UserInfo userInfo;

    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    private static final String TRAVELPAYOUTS_CLIENT_ID = "0e29a686b2ad016b6d43087b0f441dbe";

    private final FlightsAdapter flightsAdapter = new FlightsAdapter(userInfo);

    protected static Intent createIntent(Context context, UserInfo userInfo) {
        Intent intent = new Intent(context, FlightActivity.class);
        intent.putExtra("UserInfo", userInfo);
        return intent;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        userInfo = intent.getParcelableExtra("UserInfo");

        final RecyclerView recyclerView = new RecyclerView(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(flightsAdapter);




        Retrofits.flight.getData(TRAVELPAYOUTS_CLIENT_ID,
                userInfo.getStartPoint(),
                userInfo.getDestinationPoint(),
                userInfo.getStartDate().toString(),
                "month",
                100,
                userInfo.getDuration()).enqueue(new Callback<FlightResults>() {
            @Override
            public void onResponse(Call<FlightResults> call, Response<FlightResults> response) {
                flightsAdapter.addFlights(response.body().getData());
            }

            @Override
            public void onFailure(Call<FlightResults> call, Throwable t) {

            }
        });

    }



}



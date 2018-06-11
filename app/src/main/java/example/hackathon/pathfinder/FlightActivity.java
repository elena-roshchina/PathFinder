package example.hackathon.pathfinder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import example.hackathon.pathfinder.flight.FlightResults;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FlightActivity extends AppCompatActivity {

    private static final String TRAVELPAYOUTS_CLIENT_ID = "0e29a686b2ad016b6d43087b0f441dbe";

    protected static Intent createIntent(Context context, UserInfo userInfo) {
        Intent intent = new Intent(context, FlightActivity.class);
        intent.putExtra("UserInfo", userInfo);
        return intent;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && resultCode == RESULT_OK){
            finish();
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        UserInfo userInfo = intent.getParcelableExtra("UserInfo");

        final FlightsAdapter flightsAdapter = new FlightsAdapter(userInfo, this);

        final RecyclerView recyclerView = new RecyclerView(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(flightsAdapter);
        setContentView(recyclerView);

        String s = userInfo.getStartPoint();
        String s1 = userInfo.getDestinationPoint();
        String startNameAbbreviation = s.substring(s.length() - 3, s.length());
        String endNameAbbreviation = s1.substring(s1.length() - 3, s1.length());

        Retrofits.flight.getData(TRAVELPAYOUTS_CLIENT_ID,
                startNameAbbreviation,
                endNameAbbreviation,
                userInfo.getStartDate().toString(),
                "month",
                false,
                100,
                userInfo.getDuration()).enqueue(new Callback<FlightResults>() {
            @Override
            public void onResponse(Call<FlightResults> call, Response<FlightResults> response) {
                if (response.isSuccessful()) {
                    flightsAdapter.addFlights(response.body().getData());
                }

            }

            @Override
            public void onFailure(Call<FlightResults> call, Throwable t) {

            }
        });

    }



}



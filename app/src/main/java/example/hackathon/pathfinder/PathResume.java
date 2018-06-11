package example.hackathon.pathfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import example.hackathon.pathfinder.flight.Flight;

public class PathResume extends AppCompatActivity {

    private final static String EXTRA_LOCATION = "EXTRA_LOCATION";
    private final static String EXTRA_PRICE = "EXTRA_PRICE";
    private final static String EXTRA_FLIGHT = "EXTRA_FLIGHT";
    private final static String EXTRA_IMG_URL = "EXTRA_IMG_URL";
    private final static String EXTRA_APPT_PRICE = "EXTRA_APPT_PRICE";
    private final static String EXTRA_RATING = "EXTRA_RATING";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resume);
        Intent intent = getIntent();

        Flight flight = (Flight) intent.getParcelableExtra("EXTRA_FLIGHT");
        String imgURL = intent.getStringExtra("EXTRA_IMG_URL");
        int price = intent.getIntExtra("EXTRA_APPT_PRICE",0);
        Float rating = intent.getFloatExtra("EXTRA_RATING",0f);


    }
}

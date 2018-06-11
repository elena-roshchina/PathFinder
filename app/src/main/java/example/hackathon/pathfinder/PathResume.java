package example.hackathon.pathfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
        int flightPrice = flight.getValue();
        TextView title = findViewById(R.id.resume_title);
        TextView selectedFlight = findViewById(R.id.resume_flight);
        TextView selectedAppt = findViewById(R.id.resume_appts);

        title.setText("Congradulation!  You've found the option that is fitting your budget ");
        selectedFlight.setText("Flight to Paris in June = " + flightPrice + "USD");
        selectedAppt.setText("Accomodation = " + price + "USD");

        Button newSearch = findViewById(R.id.resume_search);
        newSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });


    }

    private void openSecondActivity(){
        Intent nextActivityIntent = new Intent(this, MainActivity.class);
        startActivity(nextActivityIntent);
    };


}

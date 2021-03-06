package example.hackathon.pathfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import example.hackathon.pathfinder.autocomplete.AutoCompleteResult;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText startDate, duration, sum;
    private AutoCompleteTextView startPoint, destinationPoint;
    private Button goButton;
    private int currentDay, currentMonth, currentYear;
    private UserInfo userInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Calendar currentDate = Calendar.getInstance();
        currentYear =  currentDate.get(Calendar.YEAR);
        currentMonth = currentDate.get(currentDate.MONTH);
        currentDay = currentDate.get(Calendar.DAY_OF_MONTH);

        userInfo = new UserInfo();

        startPoint = findViewById(R.id.startPointEdit);
        startPoint.addTextChangedListener(new MyTextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                if(!startPoint.getText().toString().isEmpty()) {
                    Retrofits.autocomplete.getData(
                            startPoint.getText().toString(),
                            "en",
                            "city").enqueue(new Callback<List<AutoCompleteResult>>() {
                        @Override
                        public void onResponse(Call<List<AutoCompleteResult>> call, Response<List<AutoCompleteResult>> response) {
                            convertToArray(response, startPoint);
                        }

                        @Override
                        public void onFailure(Call<List<AutoCompleteResult>> call, Throwable t) {

                        }
                    });
                    userInfo.setStartPoint(startPoint.getText().toString());
                }
            }
        });
        destinationPoint = findViewById(R.id.destinationPointEdit);
        destinationPoint.addTextChangedListener(new MyTextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                if(!destinationPoint.getText().toString().isEmpty()) {
                    Retrofits.autocomplete.getData(
                            destinationPoint.getText().toString(),
                            "en",
                            "city").enqueue(new Callback<List<AutoCompleteResult>>() {
                        @Override
                        public void onResponse(Call<List<AutoCompleteResult>> call, Response<List<AutoCompleteResult>> response) {
                            convertToArray(response, destinationPoint);
                        }

                        @Override
                        public void onFailure(Call<List<AutoCompleteResult>> call, Throwable t) {

                        }
                    });
                    userInfo.setDestinationPoint(destinationPoint.getText().toString());
                }
            }
        });
        startDate = findViewById(R.id.startDateEdit);
        startDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = DatePickerDialog.newInstance(
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
                                Calendar pickedDate = Calendar.getInstance();
                                pickedDate.set(year, monthOfYear, dayOfMonth);
                                startDate.setText(DateFormat.getDateInstance().format(pickedDate.getTime()));
                                userInfo.setStartDate(pickedDate.getTime());
                            }
                        },
                        currentYear, currentMonth, currentDay);
                if(!datePickerDialog.isVisible())
                    datePickerDialog.show(getFragmentManager(),getString(R.string.caption_start_date_dialog));
            }
        });
        duration = findViewById(R.id.endDateEdit);
        duration.addTextChangedListener(new MyTextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                if(!duration.getText().toString().isEmpty()) {
                    userInfo.setDuration(Integer.parseInt(duration.getText() + ""));
                }
            }
        });
        sum = findViewById(R.id.sumEdit);
        sum.addTextChangedListener(new MyTextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                if(!sum.getText().toString().isEmpty()) {
                    userInfo.setSum(Integer.parseInt(sum.getText().toString()));
                }
            }
        });
        goButton = findViewById(R.id.goButton);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTicketsActivity();
            }
        });
    }

    private void openTicketsActivity(){
        startActivity(FlightActivity.createIntent(this, userInfo));
    }

    protected void convertToArray(Response<List<AutoCompleteResult>> response,
                                  AutoCompleteTextView point){
        List<AutoCompleteResult> results = response.body();
        List<String> str = new ArrayList<>();
        for (AutoCompleteResult s : results) {
            str.add(s.getName() + " - " + s.getCode());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_dropdown_item_1line, str.toArray(new String[0]));
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        point.setAdapter(adapter);
    }

}

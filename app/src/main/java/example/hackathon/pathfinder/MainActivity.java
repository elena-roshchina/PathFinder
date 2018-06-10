package example.hackathon.pathfinder;

import android.content.Intent;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private EditText startPoint, destinationPoint, startDate, endDate, sum;
    private Button goButton;
    private int currentDay, currentMonth, currentYear;
    private UserInfo userInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Calendar currentDate = Calendar.getInstance();
        currentYear = currentDate.YEAR;
        currentMonth = currentDate.MONTH;
        currentDay = currentDate.DAY_OF_MONTH;

        userInfo = new UserInfo();

        startPoint = findViewById(R.id.startPointEdit);
        startPoint.addTextChangedListener(new MyTextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                userInfo.setStartPoint(startPoint.getText().toString());
            }
        });
        destinationPoint = findViewById(R.id.destinationPointEdit);
        destinationPoint.addTextChangedListener(new MyTextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                userInfo.setDestinationPoint(destinationPoint.getText().toString());
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
                datePickerDialog.show(getFragmentManager(),getString(R.string.caption_start_date_dialog));
            }
        });
        endDate = findViewById(R.id.endDateEdit);
        endDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = DatePickerDialog.newInstance(
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
                                Calendar pickedDate = Calendar.getInstance();
                                pickedDate.set(year, monthOfYear, dayOfMonth);
                                endDate.setText(DateFormat.getDateInstance().format(pickedDate.getTime()));
                                userInfo.setEndDate(pickedDate.getTime());
                            }
                        },
                        currentYear, currentMonth, currentDay);
                datePickerDialog.show(getFragmentManager(),getString(R.string.caption_end_date_dialog));
            }
        });
        sum = findViewById(R.id.sumEdit);
        sum.addTextChangedListener(new MyTextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                userInfo.setSum(Integer.parseInt(sum.getText().toString()));
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
        startActivity(TicketsActivity.createIntent(this, userInfo));
    }

}

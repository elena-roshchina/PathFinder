package example.hackathon.pathfinder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.Date;

public class TicketsActivity extends AppCompatActivity {

    private UserInfo userInfo;

    protected static Intent createIntent(Context context, UserInfo userInfo){
        Intent intent = new Intent(context, TicketsActivity.class);
        intent.putExtra("UserInfo", userInfo);
        return intent;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        userInfo = intent.getParcelableExtra("UserInfo");


    }
}

package com.example.campusconnect;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.List;




import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    EditText sDate,startTime, endTime,interval;
    ListView listView;
    List<String> slots;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sDate = findViewById(R.id.startDate);
        startTime = findViewById(R.id.start_time);
        endTime = findViewById(R.id.end_time);
        interval = findViewById(R.id.interval);

        getSlots();

    }

    private void getSlots(){
        try {
            String format = "yyyy-MM-dd HH:mm";
            SimpleDateFormat sdf = new SimpleDateFormat(format);

            Date dateobj1 =sdf.parse(sDate.getText().toString()+" "+startTime.getText().toString());

        }
    }




    public void floginpage(View view) {
        // Start the Faculty Login Activity
        setContentView(R.layout.fac_login);
    }

    public void sloginpage(View view) {
        // Start the Student Login Activity
        setContentView(R.layout.student_login);
    }
    public void fac_access(View view){

        setContentView(R.layout.fac_access);
    }

    public void onBookClassButtonClick(View view){

        setContentView(R.layout.bookclassroom);
    }
    public void onMaintenanceButtonClick(View view){
        setContentView(R.layout.maintain);
    }
}

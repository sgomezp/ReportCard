package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard reportCard = new ReportCard("Sandra",2017,10,8,7,10);
        String repordCardString = reportCard.toString();
        Log.d("resultado", repordCardString);
        reportCard.setBiologyGrade(5);
        reportCard.setCalculusGrade(6);
        reportCard.setStudentName("Gabriela");
        String repordCardString1 = reportCard.toString();
        Log.d("resultado2", repordCardString1);


    }
}

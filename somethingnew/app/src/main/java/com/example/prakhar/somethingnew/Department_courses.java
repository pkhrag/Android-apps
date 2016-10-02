package com.example.prakhar.somethingnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Department_courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_courses);
    }
    public void aero (View view) {
        Intent depart = new Intent(this, Main2Activity_aerospace.class);
        startActivity(depart);
    }

    public void cse (View view) {
        Intent depart = new Intent(this, Main2Activity_cs.class);
        startActivity(depart);
    }

    public void mth (View view) {
        Intent depart = new Intent(this, Main2Activity_mth.class);
        startActivity(depart);
    }

    public void ee (View view) {
        Intent depart = new Intent(this, Main2Activity_EE.class);
        startActivity(depart);
    }
}

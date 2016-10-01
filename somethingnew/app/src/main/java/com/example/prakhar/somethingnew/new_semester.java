package com.example.prakhar.somethingnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class new_semester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_semester);
    }

    public void departmental(View view) {
        Intent depart = new Intent(this, Department_courses.class);
        startActivity(depart);
    }

    public void so(View view) {
        Intent SO = new Intent(this, Main2Activity_so.class);
        startActivity(SO);
    }

    public void eso(View view) {
        Intent ESO = new Intent(this, eso_page.class);
        startActivity(ESO);
    }
}

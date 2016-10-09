package com.example.prakhar.somethingnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class eso_page extends AppCompatActivity {

    CheckBox eso201a, eso202a, eso203a, eso204a, eso205a, eso206a, eso207a, eso208a, eso209a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eso_page);
    }

    public void onClick(View view) {
        Intent new_sem = new Intent(this, new_semester.class);
        eso201a = (CheckBox) findViewById(R.id.ESO201A);
        eso202a = (CheckBox) findViewById(R.id.ESO202A);
        eso203a = (CheckBox) findViewById(R.id.ESO203A);
        eso204a = (CheckBox) findViewById(R.id.ESO204A);
        eso205a = (CheckBox) findViewById(R.id.ESO205A);
        eso206a = (CheckBox) findViewById(R.id.ESO206A);
        eso207a = (CheckBox) findViewById(R.id.ESO207A);
        eso209a = (CheckBox) findViewById(R.id.ESO209A);
        eso208a = (CheckBox) findViewById(R.id.ESO208A);

        new_sem.putExtra("ESO201A",eso201a.isChecked());
        new_sem.putExtra("ESO202A",eso202a.isChecked());
        new_sem.putExtra("ESO203A",eso203a.isChecked());
        new_sem.putExtra("ESO204A",eso204a.isChecked());
        new_sem.putExtra("ESO205A",eso205a.isChecked());
        new_sem.putExtra("ESO206A",eso206a.isChecked());
        new_sem.putExtra("ESO207A",eso207a.isChecked());
        new_sem.putExtra("ESO208A",eso208a.isChecked());
        new_sem.putExtra("ESO209A",eso209a.isChecked());


        startActivity(new_sem);
    }
}

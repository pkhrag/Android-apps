package com.example.prakhar.somethingnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class eso_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eso_page);
    }

    public void onClick(View view) {
        Intent new_sem = new Intent(this, new_semester.class);
        CheckBox eso201a = (CheckBox) findViewById(R.id.ESO201A);
        CheckBox eso202a = (CheckBox) findViewById(R.id.ESO202A);
        CheckBox eso203a = (CheckBox) findViewById(R.id.ESO203A);
        CheckBox eso204a = (CheckBox) findViewById(R.id.ESO204A);
        CheckBox eso205a = (CheckBox) findViewById(R.id.ESO205A);
        CheckBox eso206a = (CheckBox) findViewById(R.id.ESO206A);
        CheckBox eso207a = (CheckBox) findViewById(R.id.ESO207A);
        CheckBox eso208a = (CheckBox) findViewById(R.id.ESO208A);
        CheckBox eso209a = (CheckBox) findViewById(R.id.ESO209A);

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

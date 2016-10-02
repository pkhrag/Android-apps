package com.example.prakhar.somethingnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.content.Intent;

public class Main2Activity_so extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_so);
    }

    public void onClick(View view) {
        Intent new_sem = new Intent(this, new_semester.class);
        CheckBox mso201 = (CheckBox) findViewById(R.id.MSO201);
        CheckBox mso202 = (CheckBox) findViewById(R.id.MSO202);
        CheckBox mso203 = (CheckBox) findViewById(R.id.MSO203);
        CheckBox cso201 = (CheckBox) findViewById(R.id.CSO201);
        CheckBox cso202 = (CheckBox) findViewById(R.id.CSO202);
        CheckBox pso201 = (CheckBox) findViewById(R.id.PSO201);

        new_sem.putExtra("MSO201",mso201.isChecked());
        new_sem.putExtra("MSO202",mso202.isChecked());
        new_sem.putExtra("MSO203",mso203.isChecked());
        new_sem.putExtra("CSO201",cso201.isChecked());
        new_sem.putExtra("CSO202",cso202.isChecked());
        new_sem.putExtra("PSO201",pso201.isChecked());

        startActivity(new_sem);
    }
}

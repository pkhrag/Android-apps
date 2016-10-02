package com.example.prakhar.somethingnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Main2Activity_compulsary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_compulsary);
    }

    public void onClick(View view) {
        Intent new_sem = new Intent(this, new_semester.class);
        CheckBox com = (CheckBox) findViewById(R.id.com);
        CheckBox esc = (CheckBox) findViewById(R.id.esc);
        CheckBox ta201 = (CheckBox) findViewById(R.id.ta201);
        CheckBox ta202 = (CheckBox) findViewById(R.id.ta202);
        CheckBox eng = (CheckBox) findViewById(R.id.eng);
        CheckBox art = (CheckBox) findViewById(R.id.art);
        CheckBox phi = (CheckBox) findViewById(R.id.phi);
        CheckBox soc = (CheckBox) findViewById(R.id.soc);
        CheckBox psy = (CheckBox) findViewById(R.id.psy);

        new_sem.putExtra("com",com.isChecked());
        new_sem.putExtra("esc",esc.isChecked());
        new_sem.putExtra("ta201",ta201.isChecked());
        new_sem.putExtra("ta202",ta202.isChecked());
        new_sem.putExtra("eng",eng.isChecked());
        new_sem.putExtra("art",art.isChecked());
        new_sem.putExtra("phi",phi.isChecked());
        new_sem.putExtra("soc",soc.isChecked());
        new_sem.putExtra("psy",psy.isChecked());

        startActivity(new_sem);
    }
}

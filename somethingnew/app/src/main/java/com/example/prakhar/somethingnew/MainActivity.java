package com.example.prakhar.somethingnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "manuMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        Log.i(TAG, "onCreate");
    }

    public void onClick(View view) {
        Intent new_sem = new Intent(this, new_semester.class);
        startActivity(new_sem);
    }

}

package com.example.prakhar.somethingnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.Manifest;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.icu.util.Calendar;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

import android.Manifest.permission;



public class new_semester extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_WRITE_CALENDAR = 123;
    private static final String TAG = "manuMessages";

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

    @TargetApi(Build.VERSION_CODES.N)

    public void submit(View view) {
        String calID = "primary";
        //Calendar cal = Calendar.getInstance();
        Intent SUBMIT = new Intent(this, MainActivity.class);
        java.util.Calendar beginTime = java.util.Calendar.getInstance();
        beginTime.set(2016, 10, 2, 7, 30);
        long startMillis = beginTime.getTimeInMillis();
        java.util.Calendar endTime = java.util.Calendar.getInstance();
        endTime.set(2016, 10, 2, 8, 30);
        long endMillis = endTime.getTimeInMillis();

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_CALENDAR) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.WRITE_CALENDAR},
                    MY_PERMISSIONS_REQUEST_WRITE_CALENDAR);

            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        ContentResolver cr = getContentResolver();

        ContentValues values = new ContentValues();
        values.put(CalendarContract.Events.DTSTART, startMillis);
        values.put(CalendarContract.Events.DTEND, endMillis);
        values.put(CalendarContract.Events.TITLE, "Jazzercise");
        values.put(CalendarContract.Events.DESCRIPTION, "Group workout");
        values.put(CalendarContract.Events.CALENDAR_ID, calID);
        values.put(CalendarContract.Events.RRULE, "FREQ=WEEKLY");


        Uri uri = cr.insert(CalendarContract.Events.CONTENT_URI, values);
//        int rows = getContentResolver().update(uri, values, null, null);
        cr.insert( uri, values );
        Log.i(TAG, "submit");
        startActivity(SUBMIT);
    }
    public void compulsory(View view) {
        Intent depart = new Intent(this, Main2Activity_compulsary.class);
        startActivity(depart);
    }
}

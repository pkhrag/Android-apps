package com.example.prakhar.somethingnew;

import android.icu.util.TimeZone;
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

    //long int ESO[10][=
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
        Calendar cal = Calendar.getInstance();
        Uri EVENTS_URI = Uri.parse(getCalendarUriBase(true) + "events");

        ContentResolver cr = getContentResolver();
        ContentValues values = new ContentValues();

        long startMillis=0;
        long endMillis = 0;
        Calendar beginTime = Calendar.getInstance();
        beginTime.set(2016, 10, 2, 8, 30);
        startMillis = beginTime.getTimeInMillis();
        Calendar endTime = Calendar.getInstance();
        endTime.set(2016, 10, 2, 9, 30);
        endMillis = endTime.getTimeInMillis();
        values.put(CalendarContract.Events.CALENDAR_ID, 1);
        values.put(CalendarContract.Events.DTSTART, startMillis);
        values.put(CalendarContract.Events.DTEND, endMillis);
        values.put(CalendarContract.Events.TITLE, "Jazzercise");
        values.put(CalendarContract.Events.DESCRIPTION, "Group workout");
        values.put(CalendarContract.Events.EVENT_TIMEZONE, TimeZone.getDefault().getID());
        values.put(CalendarContract.Events.RRULE, "FREQ=WEEKLY");
        values.put(CalendarContract.Events.HAS_ALARM, 1);

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
        Uri event = cr.insert(EVENTS_URI, values);
        Log.i(TAG, "Timezone retrieved=>"+TimeZone.getDefault().getID());

        Uri REMINDERS_URI = Uri.parse(getCalendarUriBase(true) + "reminders");
        values = new ContentValues();
        values.put(CalendarContract.Reminders.EVENT_ID, Long.parseLong(event.getLastPathSegment()));
//        values.put(CalendarContract.Reminders.METHOD, Reminders.METHOD_ALERT);
        values.put(CalendarContract.Reminders.MINUTES, 10);
        cr.insert(REMINDERS_URI, values);
//        int rows = getContentResolver().update(uri, values, null, null);
//        cr.insert( uri, values );
//        long eventID = Long.parseLong(uri.getLastPathSegment());
        Log.i(TAG, String.valueOf(beginTime));
        startActivity(SUBMIT);
    }

    private String getCalendarUriBase(boolean eventUri) {
        Uri calendarURI = null;
        try {
            if (android.os.Build.VERSION.SDK_INT <= 7) {
                calendarURI = (eventUri) ? Uri.parse("content://calendar/") : Uri.parse("content://calendar/calendars");
            } else {
                calendarURI = (eventUri) ? Uri.parse("content://com.android.calendar/") : Uri
                        .parse("content://com.android.calendar/calendars");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return calendarURI.toString();
    }

    public void compulsory(View view) {
        Intent depart = new Intent(this, Main2Activity_compulsary.class);
        startActivity(depart);
    }
}

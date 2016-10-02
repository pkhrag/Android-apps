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

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class new_semester extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_WRITE_CALENDAR = 123;
    private static final String TAG = "manuMessages";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_semester);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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

        long startMillis = 0;
        long endMillis = 0;
        Calendar beginTime = Calendar.getInstance();
        beginTime.set(2016, 10, 2, 14, 30);
        startMillis = beginTime.getTimeInMillis();
        Calendar endTime = Calendar.getInstance();
        endTime.set(2016, 10, 2, 15, 30);
        endMillis = endTime.getTimeInMillis();

        long  ESO201s;
        long  ESO201e;
        beginTime.set(2016, 10, 2, 8, 30);
        ESO201s = beginTime.getTimeInMillis();
        endTime.set(2016, 10, 2, 9, 30);
        ESO201e = endTime.getTimeInMillis();

        long  ESO202s;
        long  ESO202e;
        beginTime.set(2016, 10, 2, 8, 30);
        ESO202s = beginTime.getTimeInMillis();
        endTime.set(2016, 10, 2, 9, 30);
        ESO202e = endTime.getTimeInMillis();

        long  ESO203s;
        long  ESO203e;
        beginTime.set(2016, 10, 2, 8, 30);
        ESO203s = beginTime.getTimeInMillis();
        endTime.set(2016, 10, 2, 9, 30);
        ESO203e = endTime.getTimeInMillis();

        long  ESO204s;
        long  ESO204e;
        beginTime.set(2016, 10, 2, 8, 30);
        ESO204s = beginTime.getTimeInMillis();
        endTime.set(2016, 10, 2, 9, 30);
        ESO204e = endTime.getTimeInMillis();


        long  ESO205s;
        long  ESO205e;
        beginTime.set(2016, 10, 2, 8, 30);
        ESO205s = beginTime.getTimeInMillis();
        endTime.set(2016, 10, 2, 9, 30);
        ESO205e = endTime.getTimeInMillis();

        long  ESO206s;
        long  ESO206e;
        beginTime.set(2016, 10, 2, 8, 30);
        ESO206s = beginTime.getTimeInMillis();
        endTime.set(2016, 10, 2, 9, 30);
        ESO206e = endTime.getTimeInMillis();

        long  ESO207s;
        long  ESO207e;
        beginTime.set(2016, 10, 2, 8, 30);
        ESO207s = beginTime.getTimeInMillis();
        endTime.set(2016, 10, 2, 9, 30);
        ESO207e = endTime.getTimeInMillis();

        long  ESO208s;
        long  ESO208e;
        beginTime.set(2016, 10, 2, 8, 30);
        ESO208s = beginTime.getTimeInMillis();
        endTime.set(2016, 10, 2, 9, 30);
        ESO208e = endTime.getTimeInMillis();

        long  ESO209s;
        long  ESO209e;
        beginTime.set(2016, 10, 2, 8, 30);
        ESO209s = beginTime.getTimeInMillis();
        endTime.set(2016, 10, 2, 9, 30);
        ESO209e = endTime.getTimeInMillis();

        values.put(CalendarContract.Events.CALENDAR_ID, 1);
        values.put(CalendarContract.Events.DTSTART, cal.getTimeInMillis() + 1 * 60 * 1000);
        values.put(CalendarContract.Events.DTEND, cal.getTimeInMillis() + 2 * 60 * 1000);
        values.put(CalendarContract.Events.TITLE, "Jazzercise");
        values.put(CalendarContract.Events.DESCRIPTION, "Group workout");
        values.put(CalendarContract.Events.EVENT_TIMEZONE, TimeZone.getDefault().getID());
        values.put(CalendarContract.Events.RRULE, "FREQ=WEEKLY");
        values.put(CalendarContract.Events.HAS_ALARM, 1);

        if (ActivityCompat.checkSelfPermission(this, permission.WRITE_CALENDAR) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            ActivityCompat.requestPermissions(this, new String[]{permission.WRITE_CALENDAR},
                    MY_PERMISSIONS_REQUEST_WRITE_CALENDAR);

            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        Log.i(TAG, "Timezone retrieved=>" + TimeZone.getDefault().getID());
        Uri event = cr.insert(EVENTS_URI, values);

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
            if (Build.VERSION.SDK_INT <= 7) {
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

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("new_semester Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}

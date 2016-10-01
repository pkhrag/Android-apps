package com.example.prakhar.somethingnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "manuMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Main_Page);
        Log.i(TAG,"onCreate");
        Button LogInButton = (Button)findViewById(R.id.button);

        LogInButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView text = (TextView)findViewById(R.id.textView1);
                        text.setText("Done Job!");
                    }
                }
        );

        LogInButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView text = (TextView)findViewById(R.id.textView1);
                        text.setText("Don't press so long");
                        return true; // if you return false, it will only show when the button is pressed not when released.
                    }
                }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView text = (TextView)findViewById(R.id.textView1);
        text.setText("Press the button");
    }
}

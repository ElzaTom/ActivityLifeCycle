package com.example.elzatom.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "actvititylifecycle";
    private TextView textview ;
    String displayLifeCycle ="";

    public void clear(View button) {
        displayLifeCycle ="";
        textview.setText("");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        displayLifeCycle = displayLifeCycle + "onCreate\n";
        setContentView(R.layout.activity_main);
        textview =(TextView) findViewById(R.id.text);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        displayLifeCycle = displayLifeCycle + "onStart\n";

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume\n");
        displayLifeCycle = displayLifeCycle + "onResume\n";
        textview.setText(displayLifeCycle);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        displayLifeCycle = displayLifeCycle + "onPause\n";
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        displayLifeCycle = displayLifeCycle + "onStop\n";
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        displayLifeCycle = displayLifeCycle + "onRestart\n";
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        displayLifeCycle = displayLifeCycle + "onDestroy\n";
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");
        displayLifeCycle = displayLifeCycle + "onSaveInstanceState\n";
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState");
        displayLifeCycle = displayLifeCycle + "onRestoreInstanceState\n";
    }
}

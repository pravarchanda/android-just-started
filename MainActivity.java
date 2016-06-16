package com.example.pravar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"oncreate state",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        Toast.makeText(this,"start",Toast.LENGTH_LONG).show();
        super.onStart();
    }

    @Override
    protected void onPause() {
        Toast.makeText(this,"pause",Toast.LENGTH_LONG).show();
        super.onPause();
    }

    @Override
    protected void onResume() {
        Toast.makeText(this,"resume",Toast.LENGTH_LONG).show();
        super.onResume();
    }

    @Override
    protected void onStop() {
        Toast.makeText(this,"stop",Toast.LENGTH_LONG).show();
        super.onStop();
    }

    @Override

    protected void onDestroy() {
        Toast.makeText(this,"destroy",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}

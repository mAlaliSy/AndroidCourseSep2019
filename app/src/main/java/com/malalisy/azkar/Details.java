package com.malalisy.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Log.d("DetailsActivity:", "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("DetailsActivity:", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DetailsActivity:", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DetailsActivity:", "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DetailsActivity:", "onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("DetailsActivity:", "onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DetailsActivity:", "onDestroy");

    }

}

package com.malalisy.azkar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView count, numberOfFives;
    Button increase;
    private int counter, nOfFives;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = findViewById(R.id.txtCount);
        numberOfFives = findViewById(R.id.txtNumberOfFives);
        increase = findViewById(R.id.btnIncrease);

        increase.setOnClickListener(this);


        counter = 0;

        Log.d("MainActivity:", "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity:", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity:", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity:", "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity:", "onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity:", "onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity:", "onDestroy");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnIncrease:
//                counter++;
//                if (counter >= 5) {
//                    counter = 0;
//                    nOfFives++;
//                }
//
//                count.setText(counter + "");
//                numberOfFives.setText(nOfFives + "");

                Intent intent = new Intent(MainActivity.this, Details.class);
                startActivity(intent);


                break;

        }
    }
}

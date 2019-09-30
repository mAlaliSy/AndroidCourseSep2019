package com.malalisy.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

        increase.setOnClickListener(new OnTextListener());

        counter = 0;

    }

    class OnTextListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            counter++;
            if(counter >= 5){
                counter = 0;
                nOfFives++;
            }

            count.setText(counter + "");
            numberOfFives.setText(nOfFives + "");
        }
    }

}

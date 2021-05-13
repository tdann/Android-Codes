package com.example.tdxmlcolorswap;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class XMLColorSwap extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btn);
        TextView textview = (TextView) findViewById(R.id.txt);

        final Random rand= new Random();

        button.setOnClickListener((v )-> {
            float red= rand.nextFloat();

            float green= rand.nextFloat();
            float blue= rand.nextFloat();
            textview.setText("r"+String.valueOf(red)+"   g"+String.valueOf(green+" b"+String.valueOf(blue)  ));
            textview.setTextColor(Color.rgb(red,green,blue));
        });
    }
}

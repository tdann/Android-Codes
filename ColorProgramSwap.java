package com.example.tdprogramcolorswap;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class ColorProgramSwap extends Activity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btn = new Button(this);
        btn.setText("Tap Me!");

        TextView tv = new TextView(this);
        tv.setText("Tap to Change Color");

        final Random random = new Random();

        btn.setOnClickListener((v) -> {
            float red = random.nextFloat();

            float green = random.nextFloat();
            float blue = random.nextFloat();
            tv.setText("r" + String.valueOf(red) + "   g" + String.valueOf(green + " b" + String.valueOf(blue)));
            tv.setTextColor(Color.rgb(red, green, blue));


        });
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutparams.setMarginStart(25);
        layout.addView(tv);
        layout.addView(btn,layoutparams);
        setContentView(layout);

    }
}

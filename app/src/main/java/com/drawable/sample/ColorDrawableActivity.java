package com.drawable.sample;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ColorDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_drawable);
        View view=findViewById(R.id.view_color);
        ColorDrawable colorDrawable = new ColorDrawable(Color.GREEN);
        view.setBackground(colorDrawable);

    }


}

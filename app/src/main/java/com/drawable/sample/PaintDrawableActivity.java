package com.drawable.sample;

import android.graphics.Color;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.SeekBar;

public class PaintDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_drawable_custom);


        ImageView imageView = (ImageView) findViewById(R.id.shape_image);
        PaintDrawable bg_1 = new PaintDrawable(Color.BLUE);
        bg_1.setCornerRadius(200.0f);
        PaintDrawable bg_2 = new PaintDrawable(Color.RED);
        bg_2.setCornerRadii(new float[]{100,200,100,200,200,400,200,400});
        imageView.setBackground(bg_1);
    }

}

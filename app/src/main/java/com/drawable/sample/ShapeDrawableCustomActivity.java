package com.drawable.sample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.SeekBar;

public class ShapeDrawableCustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_drawable_custom);


        ImageView imageView = (ImageView) findViewById(R.id.shape_image);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.like);
        BitmapShader shader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        shapeDrawable.getPaint().setShader(shader);
        imageView.setBackground(shapeDrawable);

    }

}

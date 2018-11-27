package com.drawable.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//https://www.jianshu.com/p/4cd87e3c43d6
//https://www.jianshu.com/p/4134e2352d65
    public void shapeDrawable(View view) {
        startActivity(new Intent(this,ShapeDrawableActivity.class));
    }

    public void bitmapDrawable(View view) {
        startActivity(new Intent(this,BitmapDrawableActivity.class));
    }

    public void layerListDrawable(View view) {
        startActivity(new Intent(this,LayerListDrawableActivity.class));
    }

    public void stateListDrawable(View view) {
        startActivity(new Intent(this,StateListDrawableActivity.class));
    }

    public void levelListDrawable(View view) {
        startActivity(new Intent(this,LevelListDrawableActivity.class));
    }

    public void transitionDrawable(View view) {
        startActivity(new Intent(this,TransitionDrawableActivity.class));
    }

    public void insetDrawable(View view) {
        startActivity(new Intent(this,InsetDrawableActivity.class));
    }

    public void clipDrawable(View view) {
        startActivity(new Intent(this,ClipDrawableActivity.class));
    }

    public void scaleDrawable(View view) {
        startActivity(new Intent(this,ScaleDrawableActivity.class));
    }

    public void colorDrawable(View view) {
        startActivity(new Intent(this,ColorDrawableActivity.class));
    }

    public void rotateDrawable(View view) {
        startActivity(new Intent(this,RotateDrawableActivity.class));
    }

    public void roundedBitmapDrawable(View view) {
        startActivity(new Intent(this,RoundedBitmapDrawableActivity.class));
    }

    public void shapeDrawableCustom(View view) {
        startActivity(new Intent(this,ShapeDrawableCustomActivity.class));
    }

    public void shapeDrawablePath(View view) {
        startActivity(new Intent(this,ShapeDrawablePathActivity.class));
    }

    public void paintDrawablePath(View view) {
        startActivity(new Intent(this,PaintDrawableActivity.class));
    }

    public void rippleDrawable(View view) {
        startActivity(new Intent(this,RippleDrawableActivity.class));
    }
}

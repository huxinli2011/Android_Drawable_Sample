package com.drawable.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class LevelListDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levellist_drawable);
    }
    public int i=0;
    public void levelList(View view) {
        view.getBackground().setLevel(i++%10);
    }
}

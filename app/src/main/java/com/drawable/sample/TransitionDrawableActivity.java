package com.drawable.sample;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class TransitionDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_drawable);
    }

    private boolean isReverse;

    public void transition(View view) {
        ImageView imageView = (ImageView) view;
        TransitionDrawable drawable = (TransitionDrawable) imageView.getBackground();
        if (!isReverse) {
            drawable.startTransition(2000);
            isReverse = true;
        } else {
            drawable.reverseTransition(2000);
            isReverse = false;
        }
    }
}

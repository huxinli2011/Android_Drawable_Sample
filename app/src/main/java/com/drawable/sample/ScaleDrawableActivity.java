package com.drawable.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.SeekBar;

public class ScaleDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_drawable);

        final ImageView imageView = (ImageView) findViewById(R.id.scale_image);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar3);
        seekBar.setMax(10000);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                imageView.getDrawable().setLevel(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //基本设置已经完毕，但是就是不显示，我们需要控制 ScaleDrawable 的 Level，我们加入一个 SeekBar 控制 Level
        //level 控制缩小的比例的，level 值是从 0 到 10000，0代表不显示，从1开始控制图片放大，10000就是原图
    }

}

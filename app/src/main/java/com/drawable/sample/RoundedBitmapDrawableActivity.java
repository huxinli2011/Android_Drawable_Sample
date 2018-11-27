package com.drawable.sample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.SeekBar;

public class RoundedBitmapDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roundedbitmap_drawable);


        ImageView imageView = (ImageView) findViewById(R.id.rounded_image);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.like);
        // 创建 600*600 正方形 Bitmap，截取头像部分
//        Bitmap newBitmap = Bitmap.createBitmap(bitmap,
//                bitmap.getWidth() / 2 - 600 / 2, //x
//                100,// y
//                600,//width
//                600//height
//        );
//        // 回收没有用的 bitmap
//        bitmap.recycle();
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmapDrawable.setCornerRadius(bitmap.getWidth() / 2);
        imageView.setImageDrawable(roundedBitmapDrawable);

    }

}

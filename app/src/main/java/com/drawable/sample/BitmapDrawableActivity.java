package com.drawable.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BitmapDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmap_drawable);
    }

    /**
     *
     * <?xml version="1.0" encoding="utf-8"?><bitmap
     *     xmlns:android="http://schemas.android.com/apk/res/android"
     *     android:src="@[package:]drawable/drawable_resource"
     *     android:antialias=["true" | "false"]    android:dither=["true" | "false"]    android:filter=["true" | "false"]    android:gravity=["top" | "bottom" | "left" | "right" | "center_vertical" |
     *                       "fill_vertical" | "center_horizontal" | "fill_horizontal" |
     *                       "center" | "fill" | "clip_vertical" | "clip_horizontal"]    android:tileMode=["disabled" | "clamp" | "repeat" | "mirror"] />
     *
     *  android:src
     * 表示：这个比较简单就是图片的资源 ID（必填）
     *
     * android:antialias
     * 表示：是否开启抗锯齿功能，（建议开启）。
     *
     * android:dither
     * 表示：是否允许开启抖动效果（建议开启）。当位图与屏幕的像素配置不同时，开启这个选项可以让搞资料的图片在低质量的屏幕上还能较好的显示效果。（例如：一个位图的像素设置是 ARGB 8888，但屏幕的设置是RGB 565，如果不开启抖动效果，图片显示就会失真）
     *
     * android:filter
         * 表示：是否允许对位图进行滤波（建议开启）。对位图进行收缩或者延展使用滤波可以获得平滑的外观效果。
     *
     * android:gravity
        * 表示：如果位图小于其容器时，设置位图显示的位置（此选项可以同“ | ”来组合使用）。
     *
     * android:mipMap
        * 这是一种图像相关的处理技术，也叫纹理映射，默认为false,不常用
     *
     * android:tileMode
         * 表示：平铺模式。开启改功能以后 android:gravity 属性会失效。
         *
         * disabled ：表示平铺模式不可用 ( 默认值 )
         *
         * clamp ：表示位图周围的像素会扩展到周围区域
         *
         * repeat ：表示水平和竖直方向上的铺平效果。
         *
         * mirror ：表示水平和竖直方向上的镜面投影效果
     *
     */


}

package com.drawable.sample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.PathShape;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class ShapeDrawablePathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_drawable_custom);


        ImageView imageView = (ImageView) findViewById(R.id.shape_image);

        // 解析 Bitmap 的宽
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), R.mipmap.like, options);
        int imageWidth = options.outWidth;
        // Path
        Path path = new Path();
        path.moveTo(imageWidth, 0);
        path.lineTo(imageWidth * 2, imageWidth);
        path.lineTo(imageWidth, imageWidth * 2);
        path.lineTo(0, imageWidth);
        path.close();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new PathShape(path, imageWidth * 2, imageWidth * 2));
        // 设置 shader
        Paint paint = shapeDrawable.getPaint();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.like);
        BitmapShader shader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        paint.setShader(shader);

        imageView.setBackground(shapeDrawable);

    }

}

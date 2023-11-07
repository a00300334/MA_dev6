package com.example.myanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image);
    }

    public void setAnim(int id){
        Animation animation = AnimationUtils
                .loadAnimation(this,id);

        imageView.startAnimation(animation);
    }

    public void scalePressed(View view) {
        setAnim(R.anim.zoom);
//        Animation animation = AnimationUtils
//                .loadAnimation(this,R.anim.zoom);
//
//        imageView.startAnimation(animation);
    }

    public void clockwisePressed(View view) {
        setAnim(R.anim.clockwise);
    }

    public void fadePressed(View view) {
        setAnim(R.anim.fade);
    }

    public void slidePressed(View view) {
        setAnim(R.anim.slide);
    }

    public void blinkPressed(View view) {
        setAnim(R.anim.blink);
    }

    public void movePressed(View view) {
        setAnim(R.anim.move);
    }
}
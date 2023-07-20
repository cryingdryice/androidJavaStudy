package com.example.doit03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView5;
    ImageView imageView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
    }

    public void onButton1Clicked(View v){
        downImage();
    }

    public void onButton2Clicked(View v){
        upImage();
    }

    private void downImage(){
        imageView5.setVisibility(View.INVISIBLE);
        imageView6.setVisibility(View.VISIBLE);
    }

    private void upImage(){
        imageView5.setVisibility(View.VISIBLE);
        imageView6.setVisibility(View.INVISIBLE);
    }
}
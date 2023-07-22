package com.example.doit07;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MAIN = 102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button1 = findViewById(R.id.customer);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "고객관리");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });

        Button button2 = findViewById(R.id.sell);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "매출관리");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });

        Button button3 = findViewById(R.id.thing);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "상품관리");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });


    }


}
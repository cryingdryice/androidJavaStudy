package com.example.doit08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_CUSTOMER = 201;
    public static final int REQUEST_CODE_SELL = 202;
    public static final int REQUEST_CODE_THING = 203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent info = getIntent();
        String id = info.getStringExtra("id");
        String pw = info.getStringExtra("pw");

        Button customer = findViewById(R.id.customer);
        customer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CustomerActivity.class);
                startActivityForResult(intent, REQUEST_CODE_CUSTOMER);
            }
        });

        Button sell = findViewById(R.id.sell);
        sell.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SellActivity.class);
                startActivityForResult(intent, REQUEST_CODE_SELL);
            }
        });

        Button thing = findViewById(R.id.thing);
        thing.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ThingActivity.class);
                startActivityForResult(intent, REQUEST_CODE_THING);
            }
        });

        Button toLogin = findViewById(R.id.toLogin);
        toLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}
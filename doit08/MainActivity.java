package com.example.doit08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101;

    EditText id;
    EditText pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.login);


        id = findViewById(R.id.id);
        pw = findViewById(R.id.pw);


        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(id.getText().toString().isEmpty() || pw.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "아이디와 비밀번호를 확인하세요.", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                    String Myid = id.getText().toString();
                    String Mypw = pw.getText().toString();
                    intent.putExtra("Myid", Myid);
                    intent.putExtra("Mypw", Mypw);
                    startActivityForResult(intent, REQUEST_CODE_MENU);
                }

            }
        });


    }

}
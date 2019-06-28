package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent_sub = getIntent();
        Person person1 = (Person) intent_sub.getSerializableExtra("user_info");

        Toast.makeText(this, person1.toString(), Toast.LENGTH_SHORT).show();


    }

    public void onClick(View view) {

        finish();
        Log.v("태그", "사용자가 로그아웃했습니다.");
    }
}

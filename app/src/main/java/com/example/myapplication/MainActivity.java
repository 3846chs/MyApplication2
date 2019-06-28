package com.example.myapplication;

// experiment 1
// experiment 2
// experiment 3

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);











    }

    public void onClick(View view) {
        // Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show();



        EditText editId = (EditText) findViewById(R.id.edit_id);
        EditText editPassword = (EditText) findViewById(R.id.edit_password);
        Button btnLogin = (Button) findViewById(R.id.btn_login);

        String id = editId.getText().toString();
        String password = editPassword.getText().toString();

        Intent intent_main = new Intent(this, SubActivity.class);
        intent_main.putExtra("user_info", new Person("홍길동", id, password));
        startActivity(intent_main);

        Log.v("태그", "사용자가 로그인했습니다.");

    }

}

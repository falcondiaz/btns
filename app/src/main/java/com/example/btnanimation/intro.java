package com.example.btnanimation;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(intro.this,MainActivity.class);
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        },3000);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

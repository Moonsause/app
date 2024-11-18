package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MusicActivity extends AppCompatActivity {
    Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_layout);



        button1=findViewById(R.id.music_start);
        button2=findViewById(R.id.music_stop);

        button1.setOnClickListener(view -> {
            Intent intent=new Intent(MusicActivity.this,MyService.class);
            startService(intent);
        });

        button2.setOnClickListener(view -> {
            Intent intent=new Intent(MusicActivity.this,MyService.class);
            stopService(intent);
        });
    }
}

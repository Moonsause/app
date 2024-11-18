package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity111 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail111);

        // 获取传递过来的数据
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");

        // 设置到视图中
        TextView titleView = findViewById(R.id.detail_title111);
        TextView descriptionView = findViewById(R.id.detail_description111);

        titleView.setText(title);
        descriptionView.setText(description);
    }
}

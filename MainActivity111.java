package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity111 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main111);

        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation111);

        // 设置点击事件监听器
        navigationView.setOnItemSelectedListener(item -> {
            // 使用 if 判断每个菜单项的点击逻辑
            if (item.getItemId() == R.id.nav_home111) {
                // 跳转到 MusicActivity
                Intent intent = new Intent(this, MusicActivity.class);
                startActivity(intent);
                return true;
            }

            if (item.getItemId() == R.id.nav_list111) {
                // 跳转到 ListActivity111
                Intent intent = new Intent(this, ListActivity111.class);
                startActivity(intent);
                return true;
            }

            if (item.getItemId() == R.id.nav_profile111) {
                // 跳转到 ProfileActivity111
                startActivity(new Intent(this, ContactActivity111.class));
                return true;
            }

            return false; // 未匹配任何菜单项
        });
    }
}

package com.example.myapplication;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity111 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_layout111);

        // 获取联系人列表容器
        LinearLayout contactList = findViewById(R.id.contact_list111);

        // 添加联系人信息
        addContact(contactList, "AAA", "1234");
        addContact(contactList, "BBB", "4567");
        addContact(contactList, "CCC", "8910");
    }

    /**
     * 添加联系人
     * @param container LinearLayout 容器
     * @param name 联系人姓名
     * @param phone 联系人电话
     */
    private void addContact(LinearLayout container, String name, String phone) {
        // 创建一个 LinearLayout 包裹联系人信息
        LinearLayout contactItem = new LinearLayout(this);
        contactItem.setOrientation(LinearLayout.VERTICAL);
        contactItem.setPadding(8, 8, 8, 8);

        // 创建联系人姓名
        TextView nameView = new TextView(this);
        nameView.setText("姓名: " + name);
        nameView.setTextSize(18);

        // 创建联系人电话
        TextView phoneView = new TextView(this);
        phoneView.setText("电话: " + phone);
        phoneView.setTextSize(16);

        // 添加到联系人条目
        contactItem.addView(nameView);
        contactItem.addView(phoneView);

        // 将条目添加到联系人列表
        container.addView(contactItem);
    }
}

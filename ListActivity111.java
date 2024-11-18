package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListActivity111 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list111);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Map<String, String>> dataList = new ArrayList<>();
        dataList.add(createMovie("我自己的爱达荷", "公路上和篝火边无尽的孤独。\n" +
                "I love you, and... you don't pay me."));
        dataList.add(createMovie("白日梦想家", "光怪陆离跳脱的电影很有趣像做了一个白日梦。"));
        dataList.add(createMovie("魔鬼代言人", "律师和燃烧的魔鬼。"));
        dataList.add(createMovie("禁闭岛", "很有意思的剧情和设定，中年的莱昂纳多也依旧喜欢。\n" +
                "有点开放式结局的感觉，琢磨到要长出脑子了。"));
        dataList.add(createMovie("机器人之梦", "浪漫至死不渝。"));
        dataList.add(createMovie("着魔", "很牛的恐怖片但是感觉有些隐喻没太看懂。\n" +
                "不算恐怖不过很癫狂很歇斯底里。"));
        dataList.add(createMovie("猎凶风河谷", "比起悬疑片更像西部片，整体很苍凉悲壮，\n"
                +"感觉人类在自然原始的地方真的很脆弱很容易死。"));
        dataList.add(createMovie("罗马假日", "奥黛丽赫本真是美绝了，特别喜欢公主的性格\n"
                +"很浪漫的过程配上很浪漫的结尾，看得哈特暖暖的。"));

        // 设置适配器
        Adapter111 adapter = new Adapter111(this, dataList);
        recyclerView.setAdapter(adapter);
    }

    // 工具方法：创建电影数据
    private Map<String, String> createMovie(String title, String description) {
        Map<String, String> movie = new HashMap<>();
        movie.put("title", title);
        movie.put("description", description);
        return movie;
    }
}
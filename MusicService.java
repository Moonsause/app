package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MusicService extends Service {

    private static final String TAG = "MusicService";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "Service created");
        // 初始化音乐播放资源
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "Service started");
        // 启动音乐播放逻辑
        playMusic();

        // 如果服务因为内存不足被系统杀死，尝试重新创建
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Service destroyed");
        // 停止音乐播放并释放资源
        stopMusic();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // 普通服务不需要实现 onBind，因为不需要与客户端通信
        return null;
    }

    private void playMusic() {
        // 实现音乐播放的逻辑
        Log.d(TAG, "Playing music");
    }

    private void stopMusic() {
        // 实现音乐停止的逻辑
        Log.d(TAG, "Stopping music");
    }
}

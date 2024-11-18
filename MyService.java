package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;


public class MyService extends Service {

    private MediaPlayer mediaPlayer;

    @Override
    public void onCreate(){
        super.onCreate();
        //加载音乐文件
        mediaPlayer=MediaPlayer.create(this,R.raw.music1);
        mediaPlayer.setLooping(true);//设置循环播放
    }

    @Override
    public int onStartCommand(Intent intent,int flags,int startId){
        if(!mediaPlayer.isPlaying()){
            mediaPlayer.start();
            Log.d("MusicService","开始播放");
        }
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("MusicService","停止播放");
        mediaPlayer.stop();
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}


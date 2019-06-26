package com.iappstogo.gridlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public void playPhrase(View btnView) {
        Button buttonPressed = (Button) btnView;
        Log.i("Button Pressed",buttonPressed.getTag().toString());

        String audioFile = getAFileName(buttonPressed.getTag().toString());
        Log.i("Audio File Name...",audioFile);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(audioFile,"raw",getPackageName()));
        mediaPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private List<AudioMap> getAudioMaps(){
        List<AudioMap> audioMaps = new ArrayList<AudioMap>();
        audioMaps.add( new AudioMap( "button0", "doyouspeakenglish" ));
        audioMaps.add(new AudioMap( "button1", "goodevening" ));
        audioMaps.add( new AudioMap( "button2", "hello" ));
        audioMaps.add( new AudioMap( "button3", "howareyou" ));
        audioMaps.add( new AudioMap( "button4", "ilivein" ));
        audioMaps.add(new AudioMap( "button5", "mynameis" ));
        audioMaps.add( new AudioMap( "button6", "please" ));
        audioMaps.add( new AudioMap( "button7", "welcome" ));
        return audioMaps;
    }

    private String getAFileName(String tagName) {
        List<AudioMap> audioMaps = getAudioMaps();
        String fileName ="";

        for (AudioMap audioMap: audioMaps) {
            try {
               if (audioMap.getBtnTag().equals(tagName)){
                   fileName = audioMap.getAudioFile();
               }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return fileName;
    }
}


package com.iappstogo.gridlayoutdemo;

public class AudioMap {
    private String btnTag;
    private String audioFile;

    public  AudioMap(String btnTag, String audioFile) {
        this.btnTag = btnTag;
        this.audioFile = audioFile;
    }

    public  String getBtnTag(){
        return this.btnTag;
    }

    public  String getAudioFile() {
        return this.audioFile;
    }
}

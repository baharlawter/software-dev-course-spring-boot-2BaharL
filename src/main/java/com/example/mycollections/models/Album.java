package com.example.mycollections.models;

public class Album extends LibraryItem{

    private int tracks;
    private String artist;
    public Album(String name, String artist, int year, int tracks){
        super(name, year);
        this.artist=artist;
        this.tracks=tracks;

    }
    public String getArtist(){return artist;}
    public void setArtist(String Artist){
        this.artist=artist;
    }
    public int getTracks(){return tracks;}
    public void setTracks (int tracks){
        this.tracks=tracks;
    }


}

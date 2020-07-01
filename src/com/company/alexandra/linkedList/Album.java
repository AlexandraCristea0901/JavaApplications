package com.company.alexandra.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public String getName() {

        return name;
    }

    public String getArtist() {
        return artist;
    }

    public SongList getSongs() {

        return songs;
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong (String title, double duration){

        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playlist){
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String songTitle, List<Song> playlist){
        Song checkedSong = this.songs.findSong(songTitle);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + songTitle + " is not in this album");
        return false;
    }



    private class SongList {
        private List<Song> songs;

        public SongList() {

            this.songs = new LinkedList<>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                System.out.println("Song already exists in the album");
                return false;
            }
            this.songs.add(song);
            return true;

        }

        private Song findSong(String title) {
            for (int i = 0; i < songs.size(); i++) {
                Song checkedSong = songs.get(i);
                if (checkedSong.getName().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber;
            if ((index >= 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}

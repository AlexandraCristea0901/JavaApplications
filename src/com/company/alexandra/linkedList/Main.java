/*
This program is meant to implement a Linked List.
We have a class Album which contains a Linked List of objects of type Song
and we can create a playlist with songs from these albums.
 */

package com.company.alexandra.linkedList;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Album> albums = new LinkedList<>();

    public static void main(String[] args) {

        Album album = new Album("First album", "Rock Band");

        album.addSong("Track 1", 4.5);
        album.addSong("Track 2", 2.5);
        album.addSong("Track 3", 4.1);
        album.addSong("Track 4", 3.5);
        album.addSong("Track 5", 3.7);
        albums.add(album);

        Album anotherAlbum = new Album("Itsy bitsy", "Pop Band");
        anotherAlbum.addSong("Single 1", 3.25);
        anotherAlbum.addSong("Single 2", 2.52);
        anotherAlbum.addSong("Single 3", 3.28);
        albums.add(anotherAlbum);

        List<Song> playlist = new ArrayList<>();

        albums.get(0).addToPlaylist("Track 1", playlist);
        albums.get(0).addToPlaylist("Track 2", playlist);
        albums.get(1).addToPlaylist( "Single 1", playlist);
        albums.get(1).addToPlaylist( "Single 2", playlist);
        albums.get(1).addToPlaylist("Single 3", playlist);
        albums.get(0).addToPlaylist("Track 3", playlist);
        albums.get(0).addToPlaylist("Single 3", playlist);
        albums.get(1).addToPlaylist("Track 1", playlist);

        listenMusic(playlist);

    }

    private static void listenMusic(List<Song> playlist) {

        ListIterator<Song> listIterator = playlist.listIterator();

        if (playlist.isEmpty()) {
            System.out.println("There are no songs in the playlist");
            return;
        } else {
            System.out.println("Now listening: " + listIterator.next().getName());
            printOptions();
        }
        boolean quit = false;
        boolean goingForward = true;
        while (!quit) {
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    System.out.println("Stopped listening...");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().getName());
                    } else {
                        System.out.println("You have reached to the end of the playlist");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().getName());
                    } else {
                        System.out.println("Start of the playlist");
                        goingForward = true;
                    }
                    break;

                case 3:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().getName());
                            goingForward = false;
                        } else {
                            System.out.println("Start of the playlist");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().getName());
                            goingForward = true;
                        } else {
                            System.out.println("End of the playlist");
                        }
                    }

                    break;

                case 4:
                    if(playlist.size() > 0)
                        listIterator.remove();
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().getName());
                    } else if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().getName());
                    }
                    break;

                case 5:
                    Iterator<Song> iterator = playlist.iterator();
                    System.out.println("=========================");
                    System.out.println("Playlist contains:");
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next().getName());
                    }
                    System.out.println("=========================");
                    break;

                case 6:
                    printOptions();
                    break;
            }

        }
    }

    private static void printOptions(){
        System.out.println("Options - press: ");
        System.out.println("\n0 - To quit" +
                "\n1 - To skip forward to the next song" +
                "\n2 - To skip backwards to a previous song" +
                "\n3 - To replay the current song" +
                "\n4 - To remove a song from the playlist" +
                "\n5 - To list the songs in the playlist" +
                "\n6 - To print the available options");
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicApp;

import java.util.ArrayList;

/**
 *
 * @author adamp
 */
public class ALMethods extends DLList implements genrePlaylists {
    
    //Pop & Rap playlists created
    ArrayList<String> rapPlaylist = new ArrayList<>();
    ArrayList<String> popPlaylist = new ArrayList<>();
    
    //constructor
    public ALMethods() {
        super();
    }
    
    // Methods implementing genrePlaylists interface
    //pop methods
    @Override
    public String addPopSong(String popSong) {
        if (popSong == null || popSong.isBlank()) {
            return "Please add a proper pop song name";
        }
        popPlaylist.add(popSong);
        return "Added " + popSong + " to your pop playlist.";
    }

    @Override
    public String showAllPopSongs() {
        if (popPlaylist.isEmpty()) {
            return "Pop playlist is empty.";
        }
        StringBuilder popSongs = new StringBuilder("Pop Playlist:\n");
        for (String song : popPlaylist) {
            popSongs.append(song).append("\n");
        }
        return popSongs.toString();
    }
    
    //rap methods 
    @Override
    public String addRapSong(String rapSong) {
        if (rapSong == null || rapSong.isBlank()) {
            return "Please add a proper rap song name";
        }
        rapPlaylist.add(rapSong);
        return "Added " + rapSong + " to your rap playlist.";
    }
    @Override
    public String showAllRapSongs() {
        if (rapPlaylist.isEmpty()) {
            return "Rap playlist is empty.";
        }
        StringBuilder rapSongs = new StringBuilder("Rap Playlist:\n");
        for (String song : rapPlaylist) {
            rapSongs.append(song).append("\n");
        }
        return rapSongs.toString();
    }
    

}


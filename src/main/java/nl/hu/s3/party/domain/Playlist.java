package nl.hu.s3.party.domain;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Song> songList = new ArrayList<>();
    private Integer maxSongs = 10;

    public List<Song> getSongList() {
        return songList;
    }

    public Integer getMaxSongs() {
        return maxSongs;
    }

    public void addSong(Song song) {

        if(songList.contains(song)) {
            throw new IllegalArgumentException("Song already exists");
        }

        songList.add(song);
    }

}

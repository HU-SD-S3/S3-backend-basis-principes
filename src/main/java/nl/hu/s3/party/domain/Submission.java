package nl.hu.s3.party.domain;

import java.util.ArrayList;
import java.util.List;

public class Submission {

    List<Song> songList = new ArrayList<>();

    public void addSong(Song song) {

        if(songList.contains(song)) {
            throw new IllegalArgumentException("Song already exists");
        }

        songList.add(song);
    }

}

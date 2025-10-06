package nl.hu.s3.party.domain;

import java.util.Arrays;
import java.util.List;

public class Song {

    String title;
    String artist;
    String genre;

    List<String> ALLOWED_GENRES = Arrays.asList(
            "Pop", "Rock", "HipHop", "Jazz", "Classical",
            "EDM", "Metal", "RnB", "Country", "Reggae", "Nederlandstalig"
    );

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public Song(String title, String artist, String genre) {

        if (!isValidGenre(genre)) {
            throw new IllegalArgumentException("Genre not allowed: " + genre);
        }
        this.title = title.trim();
        this.artist = artist.trim();
        this.genre = genre;
    }

    boolean isValidGenre(String genre) {
        if (genre == null) return false;

        for (String allowed : ALLOWED_GENRES) {
            if (allowed.equals(genre)) {
                return true;
            }
        }
        return false;
    }

}

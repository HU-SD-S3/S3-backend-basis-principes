package nl.hu.s3.party.domain;

import java.util.Objects;

public class Song {

    private String title;
    private String artist;
    private Genre genre;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public Song(String title, String artist, Genre genre) {
        this.title = title.trim();
        this.artist = artist.trim();
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }
}

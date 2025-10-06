package nl.hu.s3.party.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class assignment4Test {

    @Test
    void should_not_add_two_equal_songs() {
        // arrange
        Playlist playlist = new Playlist();

        Song s1 = new Song("Blinding Lights", "The Weeknd");
        Song s2 = new Song("Smells Like Teen Spirit", "Nirvana");
        Song s3 = new Song("Blinding Lights", "The Weeknd");

        playlist.addSong(s1);
        playlist.addSong(s2);

        // act // assert
        assertThrows(IllegalArgumentException.class, () -> playlist.addSong(s3));
    }
}

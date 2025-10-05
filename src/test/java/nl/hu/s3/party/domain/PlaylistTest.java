package nl.hu.s3.party.domain;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PlaylistTest {

    @Test
    void can_add_song() {
        // arrange
        var playlist = new Playlist();
        var newSong = new Song("Had ik maar minder gemasturbeerd", "Sander de Kroon", "Country");
        // act
        playlist.addSong(newSong);

        // assert


    }

    @Test
    void should_not_add_more_than_ten_songs() {
        // arrange
        Playlist playlist = new Playlist();
        Song[] songs = {
                new Song("Links Rechts", "Snollebollekes", "Nederlandstalig"),
                new Song("Vlieg Met Me Mee", "Paul de Leeuw", "Nederlandstalig"),
                new Song("Een Beetje Verliefd", "André Hazes", "Nederlandstalig"),
                new Song("Kleine Café Aan De Haven", "Vader Abraham", "Nederlandstalig"),
                new Song("Ik Neem Je Mee", "Gers Pardoel", "Nederlandstalig"),
                new Song("Lekker Likkie", "Gebroeders Ko", "Nederlandstalig"),
                new Song("Dansen Met Janssen", "Kris Kross Amsterdam & Donnie", "Nederlandstalig"),
                new Song("Heb Je Even Voor Mij", "Frans Bauer", "Nederlandstalig"),
                new Song("Per Spoor (Kedeng Kedeng)", "Guus Meeuwis & Vagant", "Nederlandstalig"),
                new Song("Schudden", "Def Rhymz", "Nederlandstalig"),
                new Song("Zij Gelooft In Mij", "André Hazes", "Nederlandstalig")
        };

        Stream.of(songs).forEach(playlist::addSong);

        // act // assert
        assertThrows(Exception.class, () -> playlist.addSong(new Song("Lekker Likkie", "Gebroeders Ko", "Nederlandstalig"))
        );


    }

    @Test
    void should_not_add_two_equal_songs() {
        // arrange
        Playlist playlist = new Playlist();

        Song s1 = new Song("Blinding Lights", "The Weeknd", "Pop");
        Song s2 = new Song("Smells Like Teen Spirit", "Nirvana", "Rock");
        Song s3 = new Song("Blinding Lights", "The Weeknd", "Pop");

        playlist.addSong(s1);
        playlist.addSong(s2);

        // act // assert
        assertThrows(IllegalArgumentException.class, () -> playlist.addSong(s3));
    }
}

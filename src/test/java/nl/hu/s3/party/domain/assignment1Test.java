package nl.hu.s3.party.domain;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class assignment1Test {


    @Test
    void test_access_modifiers_song() {
        Field[] fields = Song.class.getDeclaredFields();

        assertTrue(Stream.of(fields).allMatch(field ->
                Modifier.isPrivate(field.getModifiers())
        ));
    }

    @Test
    void test_access_modifiers_submission() {
        Field[] fields = Playlist.class.getDeclaredFields();

        assertTrue(Stream.of(fields).allMatch(field ->
                Modifier.isPrivate(field.getModifiers())
        ));
    }
}
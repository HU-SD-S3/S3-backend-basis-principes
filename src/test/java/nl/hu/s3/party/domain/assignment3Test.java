package nl.hu.s3.party.domain;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class assignment3Test {

    @Test
    void test_getters_song() {
        Method[] methods = Song.class.getMethods();

        assertTrue(Stream.of(methods).anyMatch(method ->
                 method.getName().startsWith("getTitle") &&
                 Modifier.isPublic(method.getModifiers()
                ))
        );

        assertTrue(Stream.of(methods).anyMatch(method ->
                method.getName().startsWith("getArtist") &&
                        Modifier.isPublic(method.getModifiers()
                        ))
        );

        assertTrue(Stream.of(methods).anyMatch(method ->
                method.getName().startsWith("getGenre") &&
                        Modifier.isPublic(method.getModifiers()
                        ))
        );
    }

}

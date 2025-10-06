package nl.hu.s3.party.domain;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class assignment2Test {

    @Test
    void test_enum_introduced() {
        Field[] fields = Song.class.getDeclaredFields();

        assertTrue(Stream.of(fields).anyMatch(field -> field.getType().isEnum()));
    }
}
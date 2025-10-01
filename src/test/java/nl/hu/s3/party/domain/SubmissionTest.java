package nl.hu.s3.party.domain;

import org.aspectj.apache.bcel.classfile.Modifiers;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SubmissionTest {

    @Test
    void should_not_add_two_qwual_songs() {
        Submission submission = new Submission();

        Song s1 = new Song("Blinding Lights", "The Weeknd", "Pop");
        Song s2 = new Song("Smells Like Teen Spirit", "Nirvana", "Rock");
        Song s3 = new Song("Blinding Lights", "The Weeknd", "Pop");

        submission.addSong(s1);
        submission.addSong(s2);

        assertThrows(IllegalArgumentException.class, () -> submission.addSong(s3));
    }

    @Test
    void test_access_modifiers() {
        Field[] fields = Submission.class.getDeclaredFields();

        assertTrue(Stream.of(fields).allMatch(field ->
            Modifier.isPrivate(field.getModifiers())
        ));
    }

    @Test
    void test_enum_introduced() {
        Field[] fields = Submission.class.getDeclaredFields();

        assertTrue(Stream.of(fields).anyMatch(field ->
                field.isEnumConstant()));
    }
}
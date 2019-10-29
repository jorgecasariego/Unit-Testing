package com.jorge.casariego.unittesting.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NoteTest {

    public static final String TIMESTAMP_1 = "05-2019";
    public static final String TIMESTAMP_2 = "04-2019";
    /**
     *  Compare two notes are equals
     *
     *  Continue with vid 6
     */
    @Test
    void isNotesEquals_identicalProperties_returnTrue() throws Exception{
        // Arrange
        Note note1 = new Note("Note 1", "This is a note #1", TIMESTAMP_1);
        note1.setId(1);

        Note note2 = new Note("Note 1", "This is a note #1", TIMESTAMP_1);
        note2.setId(1);

        //Acts


        //Asserts
        assertEquals(note1, note2);
        System.out.println("The notes are equal!");
    }

    /**
     *  Compare two notes with 2 differentes ids
     */
    @Test
    void isNotesEqual_differentsIds_returnFalse() throws Exception {
        // Arrange
        Note note1 = new Note("Note 1", "This is a note #1", TIMESTAMP_1);
        note1.setId(1);

        Note note2 = new Note("Note 1", "This is a note #1", TIMESTAMP_1);
        note2.setId(2);

        //Acts

        //Asserts
        assertNotEquals(note1, note2);
        System.out.println("The notes are not equal!");
    }
    
    /**
     * Compare two notes with 2 differentes timestamp
     */
    @Test
    void isNotesEqual_differentTimestamps_returnTrue() throws Exception {
        // Arrange
        Note note1 = new Note("Note 1", "This is a note #1", TIMESTAMP_1);
        note1.setId(1);

        Note note2 = new Note("Note 1", "This is a note #1", TIMESTAMP_2);
        note2.setId(1);

        //Acts

        //Asserts
        assertEquals(note1, note2);
        System.out.println("The notes are equal!");
    }

    /**
     * Compare two notes with differents title
     */
    @Test
    void isNotesEqual_differentTitles_returnFalse() throws Exception {
        // Arrange
        Note note1 = new Note("Note 1", "This is a note #1", TIMESTAMP_1);
        note1.setId(1);

        Note note2 = new Note("Note 2", "This is a note #1", TIMESTAMP_2);
        note2.setId(1);

        //Acts

        //Asserts
        assertNotEquals(note1, note2);
        System.out.println("The notes are not equal!");
    }

    /**
     * Compare two notes with differents contents
     */
    @Test
    void isNotesEqual_differentContent_returnFalse() throws Exception {
        // Arrange
        Note note1 = new Note("Note 1", "This is a note #1", TIMESTAMP_1);
        note1.setId(1);

        Note note2 = new Note("Note 1", "This is a note #2", TIMESTAMP_2);
        note2.setId(1);

        //Acts

        //Asserts
        assertNotEquals(note1, note2);
        System.out.println("The notes are not equal! They have differents content");
    }
}

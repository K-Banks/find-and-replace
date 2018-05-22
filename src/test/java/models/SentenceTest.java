package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class SentenceTest {
    @Test
    public void splitSentence_returnsSentenceAsArray_array() {
        Sentence testSentence = new Sentence();
        String[] answer = {"this", "is", "the", "answer"};
        assertEquals(answer, testSentence.splitSentence("this is the answer"));
    }

    @Test
    public void findAndReplace_returnsSentenceWithWordChanged_array() {
        Sentence testSentence = new Sentence();
        String[] answer = {"this", "is", "the", "solution"};
        assertEquals(answer, testSentence.findAndReplace("this is the answer", "answer", "solution"));
    }

    @Test
    public void recreateSentence_returnArrayListAsString_String() {
        Sentence testSentence = new Sentence();
        String answer = "this is the solution";
        assertEquals(answer, testSentence.recreateSentence("this is the answer", "answer", "solution"));
    }

    @Test
    public void findAndReplace_replacesPartsOfWords_array() {
        Sentence testSentence = new Sentence();
        String[] answer = {"thwas", "was", "the", "answer"};
        assertEquals(answer, testSentence.findAndReplace("this is the answer", "is", "was"));
    }
}
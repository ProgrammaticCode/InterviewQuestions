package JunitTest;

import InterviewQuestions.GoogleQuestions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TestCases {
    private GoogleQuestions checkForDuplicates = new GoogleQuestions();
    private int[] arrayToCheck = {5, 1, 3, 5, 6, 3, 2};


    @Test
    void Success() {
        assertEquals(5, checkForDuplicates.firstDuplicateHash(arrayToCheck));

    }

    @Test
    void Fail() {
        assertNotEquals(Math.random() * 10, checkForDuplicates.firstDuplicateHash(arrayToCheck));
    }
}

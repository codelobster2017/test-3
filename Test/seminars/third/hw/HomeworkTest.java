package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {


    @Test
    void anEvenNumber() {
        assertTrue(Homework.evenOddNumber(2));
    }

    @Test
    void anOddNumber() {
        assertFalse(Homework.evenOddNumber(1));
    }

    @Test
    void numberInInterval(){
        assertTrue(Homework.numberInInterval(30));
    }

    @Test
    void numberNotInInterval(){
        assertFalse(Homework.numberInInterval(10));
    }

    @Test
    void numberOnLeftBorderInterval(){
        assertFalse(Homework.numberInInterval(25));
    }

    @Test
    void numberOnRightBorderInterval(){
        assertFalse(Homework.numberInInterval(100));
    }

}
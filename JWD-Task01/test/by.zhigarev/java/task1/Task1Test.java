package task1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    Task1 task1 = new Task1();


    @Test
    void getLastDigit() {

        int input = 12345;
        int expectedResult = 5;


        int actualResult = task1.getLastDigit(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getLastDigitOfSquare() {

        int input = 12345;
        int expectedResult = 5;


        Task1 task1 = new Task1();
        int actualResult = task1.getLastDigitOfSquare(input);

        Assert.assertEquals(expectedResult, actualResult);
    }


}
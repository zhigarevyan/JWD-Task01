package task5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {
    Task5 task5 = new Task5();

    @Test
    void isDivider() {
        boolean expectedResult = true;
        int inputDivider = 2;
        int inputDividend = 4;

        boolean actualResult = task5.isDivider(inputDivider, inputDividend);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    void findSumOfDividers() {
        int expectedResult = 6;

        int input = 6;

        int actualResult = task5.findSumOfDividers(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    void isPerfect() {
        boolean expectedResult = true;
        int input = 6;

        boolean actualResult = task5.isPerfect(input);

        Assert.assertEquals(expectedResult, actualResult);

    }
}
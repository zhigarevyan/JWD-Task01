package task4;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    Task4 task4 = new Task4();

    @Test
    void isEven() {
        boolean expectedResult = true;
        int input = 6;

        boolean actualResult = task4.isEven(input);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    void isAtListTwoEvens() {
        boolean expectedResult = true;

        int[] input = new int[]{2, 4};

        boolean actualResult = task4.isAtListTwoEvens(input);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
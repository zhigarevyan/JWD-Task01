package Task8;

import Task7.Task7;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {
    Task8 task8 = new Task8();

    @Test
    void firstFunc() {
        double expectedResult = 5;

        int input = 4;

        double actualResult = task8.firstFunc(input);

        Assert.assertEquals(expectedResult, actualResult, 2);



    }

    @Test
    void secondFunc() {
        double expectedResult = 0.5;

        int input = 2;

        double actualResult = task8.secondFunc(input);

        Assert.assertEquals(expectedResult, actualResult,2);


    }

    @Test
    void calculateFunc() {
        double expectedResult = 0.5;

        int input = 2;

        double actualResult = task8.calculateFunc(input);

        Assert.assertEquals(expectedResult, actualResult,2);


    }
}
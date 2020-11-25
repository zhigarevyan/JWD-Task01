package task6;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    Task6 task6 = new Task6();

    @Test
    void getHours() {
        int expectedResult = 1;
        int input = 3600;

        int actualResult = task6.getHours(input);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    void getMinutes() {
        int expectedResult = 1;
        int input = 60;

        int actualResult = task6.getMinutes(input);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    void getSeconds() {
        int expectedResult = 1;
        int input = 61;

        int actualResult = task6.getSeconds(input);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    void getHoursMinutesSeconds() {
        String expectedResult = "1 H 1 M 1S";
        int input = 3661;

        String actualResult = task6.getHoursMinutesSeconds(input);

        Assert.assertEquals(expectedResult, actualResult);


    }
}
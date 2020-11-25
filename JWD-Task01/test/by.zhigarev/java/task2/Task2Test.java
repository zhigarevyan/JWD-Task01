package task2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    Task2 task2 = new Task2();

    @Test
    void isLeapYear() {
        boolean expectedResult = true;
        int input = 2020;

        boolean actualResult = task2.isLeapYear(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    void countOfDaysInMonth() {
        int expectedResult = 29;
        int inputMonth = 2;
        int inputYear = 2020;

        int actualResult = task2.countOfDaysInMonth(inputYear, inputMonth);

        Assert.assertEquals(expectedResult, actualResult);

    }
}
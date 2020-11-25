package Task10;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {
    Task10 task10 = new Task10();

    @Test
    void calculateFunc() {
        double expectedResult = 0;

        int input = 0;


        double actualResult = task10.calculateFunc(input);
        Assert.assertEquals(expectedResult, actualResult, 2);

    }
}
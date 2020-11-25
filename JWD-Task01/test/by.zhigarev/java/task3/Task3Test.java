package task3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    Task3 task3 = new Task3();

    @Test
    void getRadiusOfInscribedCircle() {
        double expectedResult = 2.5;
        int input = 25;

        double actualResult = task3.getRadiusOfInscribedCircle(input);

        Assert.assertEquals(expectedResult, actualResult, 2);

    }

    @Test
    void getAreaOfCircumscribedSquare() {
        int expectedResult = 18;
        int input = 3;

        int actualResult = task3.getAreaOfCircumscribedSquare(input);

        Assert.assertEquals(expectedResult, actualResult);


    }

    @Test
    void findHowMuchLargerArea() {
        int expectedResult = 2;
        int input = 100;

        int actualResult = task3.findHowMuchLargerArea(input);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
package Task9;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {
    Task9 task9 = new Task9();

    @Test
    void getArea() {
        double expectedResult = 28.27;

        int input = 3;


        double actualResult = task9.getArea(input);
        Assert.assertEquals(expectedResult, actualResult, 2);


    }

    @Test
    void getLength() {

        double expectedResult = 18.84;

        int input = 3;


        double actualResult = task9.getLength(input);
        Assert.assertEquals(expectedResult, actualResult, 2);

    }


}
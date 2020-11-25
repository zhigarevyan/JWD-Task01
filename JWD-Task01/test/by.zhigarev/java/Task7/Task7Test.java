package Task7;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class Task7Test {
    Task7 task7 = new Task7();

    @Test
    void getDistance() {
        double expectedResult = 5;

        Task7.Point input = new Task7.Point(3, 4);

        double actualResult = task7.getDistance(input);

        Assert.assertEquals(expectedResult, actualResult);


    }

    @Test
    void getNearest() {

        Task7.Point inputPointA = new Task7.Point(3, 4);
        Task7.Point inputPointB = new Task7.Point(5, 6);


        Task7.Point actualResult = task7.getNearest(inputPointA, inputPointB);


        Assert.assertEquals(inputPointA, actualResult);


    }
}
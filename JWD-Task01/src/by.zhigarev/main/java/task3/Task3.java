package task3;

public class Task3 {
    public int getRadiusOfInscribedCircle(int areaOfSquare) {
        return (int) (Math.sqrt(areaOfSquare) / 2);
    }

    public int getAreaOfCircumscribedSquare(int radiusOfCircle) {
        return (int) Math.pow(radiusOfCircle * Math.sqrt(2), 2);
    }

    public int findHowMuchLargerArea(int areaOfSquare) {
        int radiusOfInscribedCircle = getRadiusOfInscribedCircle(areaOfSquare);
        int areaOfCircumscribedSquare = getAreaOfCircumscribedSquare(radiusOfInscribedCircle);
        return areaOfSquare / areaOfCircumscribedSquare;
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.println(task3.findHowMuchLargerArea(40));
    }
}

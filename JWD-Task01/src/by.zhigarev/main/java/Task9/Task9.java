package Task9;

public class Task9 {
    final double pi = 3.1415926536;


    public double getArea(double radius) {
        return pi * Math.pow(radius, 2);
    }

    public double getLength(double radius) {
        return 2 * pi * radius;
    }

    public void getComputing(double radius) {
        System.out.println("Area: " + getArea(radius) + " Length: " + getLength(radius));
    }

    public static void main(String[] args) {
        Task9 task9 = new Task9();
        task9.getComputing(3);

    }
}

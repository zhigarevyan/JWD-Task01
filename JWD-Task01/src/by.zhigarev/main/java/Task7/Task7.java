package Task7;

import java.util.Objects;

public class Task7 {

    public static void main(String[] args) {
        Task7 task7 = new Task7();

        System.out.println(task7.getNearest(new Point(4, 2), new Point(2, -3)));
    }

    public double getDistance(Point a) {
        return Math.sqrt(a.x * a.x + a.y * a.y);
    }

    public Point getNearest(Point a, Point b) {
        return getDistance(a) < getDistance(b) ? a : b;
    }

    public static
    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }


        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }


}

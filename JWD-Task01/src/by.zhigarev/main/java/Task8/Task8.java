package Task8;

public class Task8 {
    public double firstFunc(int x) {
        return -(Math.pow(x, 2)) + (3 * x) + 9;
    }

    public double secondFunc(int x) {
        return 1 / (Math.pow(x, 3) - 6);
    }

    public double calculateFunc(int x) {
        return x >= 3 ? firstFunc(x) : secondFunc(x);
    }

    public static void main(String[] args) {
        Task8 task8 = new Task8();
        System.out.println(task8.calculateFunc(2));
    }
}

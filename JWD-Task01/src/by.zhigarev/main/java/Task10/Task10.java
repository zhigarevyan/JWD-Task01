package Task10;


public class Task10 {
    public double calculateFunc(double x) {
        return Math.tan(x);
    }

    private void printResult(double variable, double value) {
        System.out.printf("x = %f, F(x) = %f\n", variable, value);
    }

    private void getComputing(double a, double b, double h) {
        for (double i = a; i <= b; i += h) {
            printResult(i, calculateFunc(i));
        }
    }

    public static void main(String[] args) {
        Task10 task10 = new Task10();
        task10.getComputing(-10, 10, 2);
    }
}

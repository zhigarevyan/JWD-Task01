package task1;

public class Task1 {

    public int getLastDigit(int number) {
        return number % 10;
    }

    public int getLastDigitOfSquare(int number) {
        int lastDigit = getLastDigit(number);
        int square = (int) Math.pow(lastDigit, 2);
        return getLastDigit(square);
    }


    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.getLastDigitOfSquare(1234568));
    }

}

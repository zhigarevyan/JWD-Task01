package task4;

public class Task4 {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isAtListTwoEvens(int[] array) {
        int count = 0;
        for (int value : array) {
            if (isEven(value)) {
                count++;
            }
        }
        return count > 2;
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println(task4.isAtListTwoEvens(new int[]{1, 1, 3, 1, 5, 1, 7}));
    }


}

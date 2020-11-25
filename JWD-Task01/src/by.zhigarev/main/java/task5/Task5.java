package task5;


public class Task5 {

    public boolean isDivider(int divider, int dividend) {
        return dividend % divider == 0;
    }

    public int findSumOfDividers(int dividend) {
        int sumOfDividers = 0;
        for (int i = 1; i < dividend; i++) {
            if (isDivider(i, dividend)) {
                sumOfDividers += i;
            }
        }
        return sumOfDividers;
    }

    public boolean isPerfect(int number) {
        int sum = findSumOfDividers(number);
        return number == sum;
    }

    public static void main(String[] args) {
        Task5 task5 = new Task5();
        System.out.println(task5.isPerfect(28));
    }


}

package task6;

public class Task6 {
    public int getHours(int seconds) {
        return Math.round(seconds / 3600);
    }

    public int getMinutes(int seconds) {
        return (seconds - getHours(seconds) * 3600) / 60;
    }

    public int getSeconds(int seconds) {
        return seconds - getHours(seconds) * 3600 - getMinutes(seconds) * 60;
    }

    public String getHoursMinutesSeconds(int seconds) {
        return getHours(seconds) + " H " + getMinutes(seconds) + " M " + getSeconds(seconds) + "S";
    }

    public static void main(String[] args) {
        Task6 task6 = new Task6();
        System.out.println(task6.getHoursMinutesSeconds(85400));

    }
}

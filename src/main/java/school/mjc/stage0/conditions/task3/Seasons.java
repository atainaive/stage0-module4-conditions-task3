package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month < 1 || month > 12) {
            System.out.println("wrong number!");
            return;
        }
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
            return;
        }
        if (month < 6) {
            System.out.println("Spring");
            return;
        }
        if (month < 9) {
            System.out.println("Summer");
            return;
        }
        System.out.println("Autumn");
    }
}


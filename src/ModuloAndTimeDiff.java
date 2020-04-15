import java.util.Scanner;

public class ModuloAndTimeDiff {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String result = new String();
        while (n != 0) {
            int day1 = input.nextInt();
            int hour1 = input.nextInt();
            int minute1 = input.nextInt();
            int second1 = input.nextInt();
            int day2 = input.nextInt();
            int hour2 = input.nextInt();
            int minute2 = input.nextInt();
            int second2 = input.nextInt();
            
            int time1, time2, diff, remain, dayNew, hourNew, minuteNew, secondNew;
            time1 = ((day1 * 86400) + (hour1 * 3600) + (minute1 * 60) + second1);
            time2 = ((day2 * 86400) + (hour2 * 3600) + (minute2 * 60) + second2);
            if (time1 > time2)
                diff = time1 - time2;
            else
                diff = time2 - time1;
            
            dayNew = diff / 86400;
            remain = diff % 86400;
            hourNew = remain / 3600;
            remain = remain % 3600;
            minuteNew = remain / 60;
            secondNew = remain % 60;
            
            result+= String.format("(%d %d %d %d) ", dayNew, hourNew, minuteNew, secondNew);
            n--;
        }
        System.out.println(result);
        input.close();
    }

}
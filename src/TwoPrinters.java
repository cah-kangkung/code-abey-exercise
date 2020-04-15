import java.util.*;
public class TwoPrinters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        String result = new String();
        while (k != 0) {
            int x = input.nextInt();
            int y = input.nextInt();
            int n = input.nextInt();
            
            result += time(x, y, n) + " ";
            k--;
        }
        System.out.println(result);
        input.close();
    }
    // this algorithm is really slow for the required input (up to 1,000,000,000)
    // waiting up to 20 seconds for the console to show some output
    // hence i stil use it because of the simplicity
    public static int time(int x, int y, int n) {
        int second = 1;
        int page = 0;
        // add page by 1 if second is multiple of x or y
        // stop when page overlaps n
        while (page < n) {
            if (second % x == 0) { 
                page++;
            }
            if (second % y == 0) {
                page++;
            }
            second++;
        }
        return second - 1;
    }
}
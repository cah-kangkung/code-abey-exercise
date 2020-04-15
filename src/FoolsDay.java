
import java.util.Scanner;

public class FoolsDay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String result = new String();
        while (n != 0) {
            String[] s = input.nextLine().split(" ");
            int a = sqr(s);
            result += a + " ";
            n--;
        }
        System.out.println(result);
        input.close();
    }

    public static int sqr(String[] array) {
        int n = array.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (Integer.parseInt(array[i]) * Integer.parseInt(array[i]));
        }
        return sum;
    }

}
import java.util.*;

public class AverageOfArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String result = new String();
        while (n != 0) {
            String s = input.nextLine();
            s = s.substring(0, s.length()-2);
            int a = avg(s);
            result += a + " ";
            n--;
        }
        System.out.println(result);
        input.close();
    }
    
    public static int avg(String value) {
        StringTokenizer st = new StringTokenizer(value, " ");
        int divider = 0;
        int result = 0;
        while (st.hasMoreTokens()) {
            String num = st.nextToken();
            result += Integer.parseInt(num);
            divider++;
        }
        return result/divider;
    }
}
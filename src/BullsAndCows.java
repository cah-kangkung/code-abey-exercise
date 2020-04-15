import java.util.*;

public class BullsAndCows {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scr = input.nextInt();
        int n = input.nextInt();
        String result = new String();
        while (n != 0) {
            result += bc(scr, input.nextInt());
            n--;
        }
        System.out.println(result);
        input.close();
    }
    
    public static String bc(int secretV, int guess) {
        String str1 = Integer.toString(secretV);
        String str2 = Integer.toString(guess);
        
        int hint1 = 0;
        for (int i = 0; i < str1.length(); i++ ) {
            if (str1.charAt(i) == str2.charAt(i))
                hint1++;
        }
        int hint2 = 0;
        for (int i = 0; i < str1.length(); i++ ) {
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(i) == str2.charAt(i))
                    continue;
                if (str1.charAt(i) == str2.charAt(j))
                    hint2++;
            }
        }
        return String.format("%d-%d ", hint1, hint2);
    }

}
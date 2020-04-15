import java.util.Scanner;

public class FunyWordGenerator {
    
    // initiate variable;
    private static int A = 445;
    private static int C = 700001;
    private static int M = 2097152;
    private static int X = 0;
    private static String consonant = "bcdfghjklmnprstvwxz";
    private static String vowels = "aeiou";
    
    // same as linearCongruential
    // it just add another calculation every n step such as
    // X % 19 for even index and X % 5 for the odd ones
    // and then find the letter with the remainder of it as an index
    public static String generate(int n) {
        String result = new String(); // to store final word
        // this 'for' seperate odd and even index
        for (int i = 0; i < n; i++) {
            X = (A * X + C) % M;
            int index = 0;
            //System.out.println(X);
            if (i % 2 == 0) {
                index = X % 19;
                result += consonant.charAt(index);
            }
            else {
                index = X % 5;
                result += vowels.charAt(index);
            }
        }
        return result;
    }
        
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        X = input.nextInt();
        String result = new String();
        while (k != 0) {
            String str = generate(input.nextInt());
            result += str + " ";
            k--;
        }
        System.out.println(result);
        input.close();
    }

}
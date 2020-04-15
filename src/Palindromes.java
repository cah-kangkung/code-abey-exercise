import java.util.*;

public class Palindromes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String result = new String();
        while (n != 0) {
            String line = input.nextLine();
            line = line.toLowerCase();
            line = line.replaceAll("[^a-z]", "");
            String line2 = reverse(line);
            if (line.equals(line2))
                result += "Y" + " ";
            else
                result += "N" + " ";
            n--;
        }
        System.out.println(result);
        input.close();
    }
    
    public static String reverse(String str) {
        String res = new String();
        for (int i = str.length()-1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }

}
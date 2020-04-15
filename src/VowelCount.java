import java.util.*;

public class VowelCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String result = " ";
        while (n != 0) {
            String s = input.nextLine(); //it's the nature of nextLine() that the last line of the data must follow with an enter (\n)
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o' || c == 'y')
                    sum++;
            }
            result += sum + " ";
            n--;
        }
        System.out.println(result);
        input.close();
        
    }

}
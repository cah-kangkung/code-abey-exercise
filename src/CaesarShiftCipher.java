import java.util.Scanner;

public class CaesarShiftCipher {

    private static String[] letter = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S"
            , "T", "U", "V", "W", "X", "Y", "Z"};
    private static int k = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int key = input.nextInt();
        String result = new String();
        input.nextLine();
        k = key;
        while (n != 0) {
            String line = input.nextLine();
            result += transWord(line) + " ";
            n--;
        }
        System.out.println(result);
        input.close();
    }
    
    private static String transWord(String line) {
        String result = new String();
        for (int i = 0; i < line.length(); i++) {
            String s = transLetter(Character.toString(line.charAt(i)));
            result += s;
        }
        return result;
    }
    
    public static String transLetter(String alphabet) {
        if (alphabet.equals("."))
            return ".";
        if (alphabet.equals(" "))
            return " ";
        
        int index = 0;
        for (int i = 0; i < letter.length; i++) {
            if (letter[i].equals(alphabet)) {
                if (i - k < 0)
                    index = letter.length-(k-i);
                else
                    index = i-k;
            } 
        }
        return letter[index];

    }

}
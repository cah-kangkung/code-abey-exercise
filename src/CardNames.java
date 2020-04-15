import java.util.*;

public class CardNames {
    
    private static String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String result = new String();
        while (n != 0) {
            int a = input.nextInt();
            String str = cardNames(a);
            result += str + " ";
            n--;
        }
        System.out.println(result);
        input.close();
    }
    
    public static String cardNames(int cardValue) {
        int suitValue = cardValue / 13;
        int rankValue = cardValue % 13;
        return String.format("%s-of-%s", ranks[rankValue], suits[suitValue]);
    }

}
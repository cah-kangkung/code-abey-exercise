import java.util.*;

public class CardShuffling {

    private static String[] suits = {"C", "D", "H", "S"};
    private static String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> array = generateArr();
        String[] deck = new String[52];
        // generating an array of deck
        for (int i = 0; i < 52; i++) {
            deck[i] = array.get(i);
        }
        // iterate through input
        for (int i = 0; i < deck.length; i++) {
            int n = input.nextInt();
            n = n % 52;
            String temp = deck[i];
            deck[i] = deck[n];
            deck[n] = temp;
        }
        for (int i = 0; i < deck.length; i++) {
            System.out.print(deck[i] + " ");
        }
        input.close();
        
    }

    public static ArrayList<String> generateArr() {
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < suits.length; i++) {
            String card = new String();
            for (int j = 0; j < ranks.length; j++) {
                card = suits[i] + ranks[j];
                array.add(card);
            }
        }
        return array;
    }
}
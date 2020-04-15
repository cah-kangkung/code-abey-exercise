import java.util.*;

public class BlackJackCounting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String result = new String();
        while(n != 0) {
            String[] str = input.nextLine().split(" ");
            sortA(str);
            result += countingBJ(str) + " ";
            n--;
        }
        System.out.println(result);
        input.close();
    }
    
    // sum up every element in String[] array with the given condition
    // pretty much straightforward
    public static String countingBJ(String[] line) {
        int count = 0;
        for (int i = 0; i < line.length; i++) {
            if (Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9").contains(line[i]))
                count += Integer.parseInt(line[i]);
            if (Arrays.asList("T", "J", "Q", "K").contains(line[i]))
                count += 10;
            if (line[i].equals("A")) {
                if ((count + 11) > 21)
                    count++;
                else if (count + 11 <= 21)
                    count += 11;
            }
        }
        if (count > 21)
            return "Bust";
        return Integer.toString(count);
    }
    
    // here i made a method to sort String[] array so that every "A" is at the very last
    // it makes the condition at method countingBJ much 'less-complicated'
    public static String[] sortA(String[] line) {
        String swap;
        for (int i = line.length-1; i > 0; i--) {
            //System.out.print(array[i]);
            int max = i;
            for (int j = 0; j <= i; j++) {
                if (line[j].equals("A")) {
                    max = j;
                }
            }
            swap = line[i];
            line[i] = line[max];
            line[max] = swap;
        }
        return line;
    }

}
import java.util.*;

public class NeumannRandomGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        String result = new String();
        while (k != 0) {
            int s = generate(input.nextInt());
            result += s + " ";
            k--;
        }
        System.out.println(result);
        input.close();
    }
    
    public static int generate(int n) {
        String[] array = new String[111];
        int iteration = 1;
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.toString(n);
            n = n*n;
            String nStr = String.format("%08d", n);
            n = Integer.parseInt(nStr);
            n = (n / 100) % 10000;
            if (contains(array, Integer.toString(n)))
                break;
            else
                iteration++;
        }
        
        return iteration;    
    }
    
    public static boolean contains(String[] array, String n) {
        return Arrays.asList(array).contains(n);
    }


}
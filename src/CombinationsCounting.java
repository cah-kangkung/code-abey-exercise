import java.math.BigInteger;
import java.util.Scanner;

public class CombinationsCounting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int step = input.nextInt();
        String result = new String();
        while (step != 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            result += combi(n, k) + " ";
            step--;
        }
        System.out.println(result);
        input.close();
        
    }
    
    public static BigInteger combi(int n, int k) {
        // C(N,k) = N! / K! * (N-K)!
        BigInteger C = factorial(n).divide((factorial(k).multiply(factorial(n-k))));
        return C;
    }
    
    public static BigInteger factorial(int a) {
        if (a == 0)
            return BigInteger.ONE; // by definition
        BigInteger A = BigInteger.ONE;
        for (int i = 1; i <= a; i++) {
            A = A.multiply(BigInteger.valueOf(i)); 
        }
        return A;
    }
}
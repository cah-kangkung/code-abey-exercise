import java.math.BigInteger;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		String result = new String();
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		list.add(BigInteger.ZERO);
		list.add(BigInteger.ONE);
		for (int i = 2; i < 1000; i++) {
			list.add(list.get(i-1).add(list.get(i-2)));
		}
		while (n != 0) {
			String str = input.nextLine();
			BigInteger A = new BigInteger(str);
			result += list.indexOf(A) + " ";
			n--;
		}
		System.out.println(result);
		input.close();
		
		
	}

}

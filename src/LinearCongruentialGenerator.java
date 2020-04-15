import java.util.*;
public class LinearCongruentialGenerator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		String result = new String();
		while (k != 0) {
			int a = input.nextInt();
			int c = input.nextInt();
			int m = input.nextInt();
			int x = input.nextInt();
			int n = input.nextInt();
			
			result += generate(a, c, m, x, n) + " ";
			k--;
		}
		System.out.println(result);
		input.close();
	}
	
	public static int generate(int a, int c, int m, int x, int n) {
		while (n != 0) {
			x = (a * x + c) % m;
			n--;
		}
		return x;
	}

}

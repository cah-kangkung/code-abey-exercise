import java.util.Scanner;

public class GCD {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = new String();
		while (n != 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			result += "(" + gcd(a, b) + " " + lcm(a, b) + ") ";
			n--;
		}
		System.out.println(result);
		input.close();
		//System.out.println(gcd(2, 3));
		//System.out.println(lcm(2, 3));
	}
	
	public static int gcd(int a, int b) {
		while (a != b) {
			if (a < b)
				b = b - a;
			else
				a = a - b;
		}
		return a;
	}
	
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
	
}

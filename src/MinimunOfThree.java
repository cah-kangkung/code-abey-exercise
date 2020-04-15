import java.util.Scanner;

public class MinimunOfThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = "";
		while(n != 0) {
			int min = 0;
			int a, b, c;
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			if (a < b && a < c) {
				min = a;
			}
			else if ( b < a && b < c) {
				min = b;
			}
			else if (c < a && c < b) {
				min = c;
			}
			result += min + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}
	
}

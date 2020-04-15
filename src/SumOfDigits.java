import java.util.*;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = "";
		while (n != 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			int sum = a*b+c;
			int total = 0;
			while (sum != 0) {
				int r1 = sum % 10;
				//System.out.println("remainder = " + r1);
				sum = sum / 10;
				//System.out.println("next divider = " + sum);
				total += r1;
			}
			result += total + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}

}

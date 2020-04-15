import java.util.*;
public class WeightedSumOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = "";
		while (n != 0) {
			int a = input.nextInt();
			String s = Integer.toString(a);
			int counter = 1;
			int sum = 0;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				int x = Integer.parseInt(String.valueOf(c)) * counter;
				sum += x;
				counter++;
			}
			result += sum + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}

}

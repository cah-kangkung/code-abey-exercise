import java.util.*;
public class ArithmeticProgression {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = "";
		while (n != 0) {
			int a, b, k;
			a = input.nextInt();
			b = input.nextInt();
			k = input.nextInt();
			int val = 0;
			for (int i = 0; i < k; i++) {
				val += (a + b*i);
			}
			result += val + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}

}

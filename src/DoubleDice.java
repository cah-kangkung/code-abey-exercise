import java.util.*;

public class DoubleDice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = new String();
		while (n != 0) {
			int val1 = input.nextInt();
			int val2 = input.nextInt();
			val1 = val1 % 6 + 1;
			val2 = val2 % 6 + 1;
			int sum = val1 + val2;
			result += sum + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}

}

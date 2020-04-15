import java.util.*;
public class DiceRolling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = " ";
		while (n != 0) {
			float a = input.nextFloat();
			float x = a*6 + 1;
			int d = (int) Math.floor(x);
			result += d + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}

}

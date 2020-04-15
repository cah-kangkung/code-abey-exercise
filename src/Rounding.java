import java.util.*;

public class Rounding {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = "";
		while(n != 0) {
			double a, b;
			double round;
			a = input.nextDouble();
			b = input.nextDouble();
			
			round = Math.round(a / b);
			result += Math.round(round) + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}

}

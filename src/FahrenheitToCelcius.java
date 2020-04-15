import java.util.*;
public class FahrenheitToCelcius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = " ";
		while(n != 0) {
			double f = input.nextDouble();
			//System.out.println(f);
			double c = (5.0/9.0)*(f - 32.0);
			//System.out.println(c);
			result += Math.round(c) + " ";;
			n--;
		}
		System.out.println(result);
		input.close();
	}

}

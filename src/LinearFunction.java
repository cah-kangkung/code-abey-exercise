import java.util.Scanner;

public class LinearFunction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = new String();
		while (n != 0) {
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			
			int a = (y1 - y2) / (x1 - x2);
			int b = y1 - (a * x1);
			
			result += "(" + a + " " + b + ") ";
			n--;
		}
		System.out.println(result);
		input.close();
	}

}

import java.util.*;

public class PythagoreanTheorem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = new String();
		while (n != 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			
			result += phytago(a, b, c) + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}
	
	public static String phytago(int a, int b, int c) {
		String s = new String();
		if (c*c == a*a + b*b) 
			s += "R";
		else {
			if (c*c < a*a + b*b)
				s += "A";
			if (c*c > a*a + b*b)
				s += "O";
		}
		return s;
	}
	
}

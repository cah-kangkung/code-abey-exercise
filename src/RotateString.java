import java.util.*;

public class RotateString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = new String();
		while (n !=0) {
			int a = input.nextInt();
			String b = input.next();
			String s = rotate(a, b);
			result += s + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}
	
	public static String rotate(int n, String s) {
		String str = new String();
		if (n > 0) {
			str += s.substring(n) + s.substring(0, n);
		}
		if (n < 0) {
			n = Math.abs(n);
			str += s.substring(s.length() - n) + s.substring(0, s.length() - n);
		}
		return str;
	}

}

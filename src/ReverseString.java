import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String res = new String();
		for (int i = s.length()-1; i >= 0; i--) {
			res += s.charAt(i);
		}
		System.out.println(res);
		input.close();
	}

}

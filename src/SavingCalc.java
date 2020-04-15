import java.util.*;

public class SavingCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = new String();
		while (n != 0) {
			int s = input.nextInt();
			int r = input.nextInt();
			int p = input.nextInt();
			result += countYears(s, r, p) + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}
	
	public static int countYears(double s, int r, int p) {
		int year = 0;
		while (s <= r) {
			double inc = (p*s) / 100;
			s += inc;
			year += 1;
		}
		return year;
	}

}

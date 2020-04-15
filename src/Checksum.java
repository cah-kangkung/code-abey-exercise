import java.util.*;

public class Checksum {

	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		long res = 0;
		int limit = 10000007;
		int seed = 113;
		for (int i = 0; i < array.length; i++) {
			res = res % limit;
			res = (res + input.nextInt()) * seed;
			res = res % limit;
		}
		System.out.println(res);
		input.close();
	}

}

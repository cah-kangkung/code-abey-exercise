import java.util.*;

public class Coba {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		String result = new String();
		int limit = 2750131;
		// generating prime number from 2 to n limits
		// using example from the web as a limit (the 199999th prime is 2750131)
		// since we aren't going to exceed the limit of 200000 prime numbers
		list.add(2);
		for (int i = 3; i <= limit; i += 2) { 
			if (isPrime(i))
				list.add(i);
		}
		
		list.remove(4);
		
		/*for (int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}*/
		
		while (n != 0) {
			int a = input.nextInt();
			int t = list.get(a-1);
			result += t + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i*i < n; i++) {
			if (n % i == 0)
				return false;
			else
				continue; //just for the sake of easy understanding the algorithm
		}
		return true;
		
		
	}
}
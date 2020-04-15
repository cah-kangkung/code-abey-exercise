import java.math.BigInteger;
import java.util.*;

public class ModularCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger N = BigInteger.valueOf(input.nextLong());
		input.nextLine();
		while (true) {
			String[] line = input.nextLine().split(" ");
			if (line[0].equals("+")) 
				N =  N.add(new BigInteger(line[1]));
			if (line[0].equals("*"))
				N = N.multiply(new BigInteger(line[1]));
			if (line[0].equals("%")) {
				N = N.remainder(new BigInteger(line[1]));
				break;
			}
		}
		System.out.println(N);
		input.close();
	}
}

import java.util.Scanner;

public class KingAndQueen {
    
    private final static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String result = new String();
        while (n != 0) {
            String k = input.next();
            String q = input.next();
            if (isLineUp(k, q))
                result += "Y ";
            else 
                result += "N ";
            n--;
        }
        System.out.println(result);
        input.close();
    }
    
    public static boolean isLineUp(String k, String q) {
        if(k.charAt(0) == q.charAt(0) || k.charAt(1) == q.charAt(1)) 
            return true;
        int indexK = 0;
        int indexQ = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if (k.charAt(0) == alphabet[i])
                indexK = i + 1;
        }
        for (int j = 0; j < alphabet.length; j++) {
            if (q.charAt(0)== alphabet[j])
                indexQ = j + 1;
        }
        if (Math.abs((int)k.charAt(1) - (int)q.charAt(1)) == Math.abs(indexK - indexQ))
            return true;
        
        return false;
    }

}
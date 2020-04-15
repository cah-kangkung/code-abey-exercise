import java.util.*;
public class TicTacToe {
    
    // Sraightforward code
    // do 'checkWin' every step of input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String result = new String();
        while (n != 0) {
            ArrayList<Integer> playerX = new ArrayList<Integer>();
            ArrayList<Integer> playerO = new ArrayList<Integer>();
            int step = 1;
            
            // Create seperate index for player
            // if index is even, nextInt() belongs to playerX
            // the rest belongs to playerO
            for (int i = 0; i < 9; i++) {
                if (i %  2 == 0) {
                    playerX.add(input.nextInt());
                    if (checkWin(playerX)) {
                        input.nextLine(); // why nextLine() ? because not every test case iterates to the end. 
                        break;
                    }
                    step++;
                }
                else {
                    playerO.add(input.nextInt());
                    if (checkWin(playerO)) {
                        input.nextLine(); // so nextLine() makes sure that the next nextInt() are from different line under
                        break;
                    }
                    step++;
                }
            }
            //System.out.println(playerX);
            //System.out.println(playerO);
            if (step > 9)
                step = 0;
            result += step + " ";
            n--;
        }
        System.out.println(result);
        input.close();
    }
    
    // Contain every winScenario possible --> 8 possibility.
    // Compare each scenario with 'player'.
    // If match returns true, false if it doesn't.
    public static boolean checkWin(ArrayList<Integer> player) {
        int[][] winScenario  = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, {1, 5, 9}, {3, 5, 7}};
        for (int i = 0; i < winScenario.length; i++) {
            if (contain(player, winScenario[i]))
                return true;
            else
                continue;
        }
        return false;
    }
    
    // So apparently Arrays.asList().contain() did not fulfill my needs.
    // Instead i make my own 'contain' method to check wether player.contain(givenArg)
    // wich givenArg happens to be an array of possible winScenario.
    // How it works is for every element in win[], it checks wheter there are atleast
    // one element in 'player' that is the same. If so, we add counter by 1.
    // Final conditiion check is, if there's only 1 or 2 element that match (count < 3)
    // returns false, else returns true;
    public static boolean contain(ArrayList<Integer> player, int[] win) {
        int count = 0;
        for (int i = 0; i < win.length; i++) {
            for (int j = 0; j < player.size(); j++) {
                if (win[i] == player.get(j))
                    count++;
            }
        }
        if (count < 3)
            return false;
        return true;
    }

}
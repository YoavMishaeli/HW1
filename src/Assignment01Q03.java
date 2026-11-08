/**
 * Question 3
 * Takes a natural number x >= 3 as a command-line argument.
 * It prints the first x elements of the Fibonacci sequence,
 * followed by the total number of odd elements among them.
 */

public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = 0;
        if (args.length > 0) {
            String numStr = args[0];
            for (int i = 0; i < numStr.length(); i++) {
                char c = numStr.charAt(i);
                x = x * 10 + (c - '0');
            }
         }
        System.out.println("The first " + x + " Fibonacci numbers are:");
        
        int numOdd = 0;
        int a = 1;
        int b = 1;
        for (int i = 0; i < x; i++) {
           System.out.print(a);
            
            if (i < x - 1) {
                System.out.print(" "); // Make sure we don't print a trailing space
            }
            
            // בדיקה האם המספר הנוכחי (a) אי-זוגי
            if (a % 2 != 0) {
                numOdd++;
            }
            
            // חישוב האיבר הבא בפיבונאצ'י
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}

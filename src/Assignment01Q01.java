/**
 * Question 1
 * Takes any number of strings as command-line arguments.
 * For each string, it checks if the ASCII value of its first character is divisible by 5.
 * If the condition is met, the character is printed on a new line.
 */
public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String str : args) {
            if (str.length() > 0) {
                char firstChar = str.charAt(0);
                if (firstChar % 5 == 0) {
                    System.out.println(firstChar);
                }
            }
        }
    }
}

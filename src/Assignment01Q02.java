/**
 * Question 2
 * Approximates the value of pi using the Leibniz formula.
 * Takes one command-line argument, the number of summands.
 */
public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        if ( args.length > 0 ){
            String numStr = args[0];
            int n = 0;

            for (int i = 0; i < numStr.length(); i++) {
                char c = numStr.charAt(i);
                n = n * 10 + (c - '0');
                
            }
            double sum = 0.0;
            for ( int i = 0; i < n; i++){
                double term = 1.0 / (2 * i + 1);
                if ( i % 2 == 0 ){
                    sum += term;
                } else {
                    sum -= term;
                }
            }
            approxPi = 4 * sum;
        }
        System.out.println(approxPi + " " + actualPi);
    }
}

package recursion;

public class RecursiveFibonacci {

    /**
     * basic - The simple version of Fibonacci.
     *
     * @param n A positive integer.
     * @return The nth Fibonacci number.
     */
    public long basic(long n) {
        long result = 1;

        if (n <= 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            result = basic(n - 1) + basic(n - 2);
        }

        return result;
    }

    /**
     * better - A better version of Fibonacci. (Height Limited Double Recursion)
     *
     * @param n A positive integer.
     * @return The nth Fibonacci number.
     */
    public long better(long n) {
        long result = 1;// = 0;
        // IMPLEMENT THIS RECURSIVE METHOD
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n % 2 == 0 && n > 1) {
            return (long) Math.pow(better(n / 2), 2) + 2 * better(n / 2) * better(n / 2 - 1);

        } else if (n % 2 == 1 && n > 1) {
            return 2 * (long) Math.pow(better(n / 2), 2) + 2 * better(n / 2) * better(n / 2 - 1) + (long) Math.pow(better(n / 2 - 1), 2);
        }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<        
        return result;
    }

    /**
     * tailRecursive - A tail recursive version of Fibonacci. (Height limited,
     * Two problems per level)
     *
     * @param n A positive integer.
     * @return The nth Fibonacci number.
     */
    public long tailRecursive(long n) {
        // IMPLEMENT THIS METHOD USING A RECURSIVE HELPER FUNCTION
        // AND RETURN AN APPROPRIATE VALUE
//>>>>>>>>> REPLACEMENT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        

        return helper(n, 1, 0);
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<        
    }

    /**
     * helper - The tail recursive helper function.
     *
     * @param n A positive integer.
     * @param fi The partial result f(i).
     * @param fi1 The partial result f(i-1).
     * @return The nth Fibonacci number.
     */
    public long helper(long n, long fi, long fi1) {
        long result = 1;
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>           
//Base cases
        if (n <= 0) { // for also the negative ns
            return fi1;
        } else if (n == 1) {
            return fi;
        } else if (n > 1) {
            if (secondMSB(n)) {
                result = helper(reduceBy2ndMSB(n), 2 * fi * fi + 2 * fi * fi1 + fi1 * fi1, fi * fi + 2 * fi1 * fi);
            } else {
                //syste
                result = helper(reduceBy2ndMSB(n), fi * fi + 2 * fi * fi1, fi * fi + fi1 * fi1);
            }

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< 
        }
        return result;

    }

    /**
     * secondMSB - Determine the value of the second most significant bit.
     *
     * @param n A positive integer
     * @return True if the second most significant bit is 1, false otherwise.
     */
    public boolean secondMSB(long n) {
        // IMPLEMENT THIS METHOD AND RETURN AN APPROPRIATE VALUE
//>>>>>>>>> REPLACEMENT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        

        boolean temp = (n >= ((long) Math.pow(2, ((long) Math.floor(Math.log(n) / Math.log(2))))
                + (long) Math.pow(2, (long) Math.floor(Math.log(n) / Math.log(2)) - 1)));
        return temp;

        // return  n >= 2 ^ (floor ( log2 (n) ) ) + 2^ (floor ( log2 (n) ) -1) ; 
// If true then the number is composed of at least 00011... if false the number is made of 
//00010...
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< 
    }

    /**
     * reduceBy2ndMSB - Reduce the number by removing the second most
     * significant bit from the representation.
     *
     * @param n A positive integer > 1
     * @return The integer value equivalent to removing the 2nd most significant
     * bit from n.
     */
    public long reduceBy2ndMSB(long n) {
        long result;// = 1;
        // IMPLEMENT THIS METHOD
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  

        result = (secondMSB(n)) ? n - (long) Math.pow(2, ((long) Math.floor(Math.log(n) / Math.log(2))))
                : (n - (long) Math.pow(2, (long) Math.floor(Math.log(n) / Math.log(2)) - 1));

        return result;

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    }

}

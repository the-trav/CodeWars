package codewars;

/**
 *
 * You might know some pretty large perfect squares. But what about the NEXT
 * one? Complete the findNextSquare method that finds the next integral perfect
 * square after the one passed as a parameter. Recall that an integral perfect
 * square is an integer n such that sqrt(n) is also an integer. If the parameter
 * is itself not a perfect square, than -1 should be returned. You may assume
 * the parameter is positive.
 */
public class NumberFun {

    public static long findNextSquare(long sq) {
        double isSquare = Math.sqrt(sq);
        long grabNumber = (long) isSquare;
        
        double test = isSquare - grabNumber;
        if (test != 0) {//happens if <code>sq is not perfect square
            return -1;
        }

        boolean condition = true;
        while (condition == true) {//runs until the next perfect square is found
            grabNumber = grabNumber + 1;
            double squareTheNumber = grabNumber * grabNumber;
            isSquare = Math.sqrt(squareTheNumber);
            grabNumber = (long) isSquare;
            test = isSquare - grabNumber;
            if (test == 0.0) {
                condition = false;
            }
        }
        return grabNumber * grabNumber;
    }

}

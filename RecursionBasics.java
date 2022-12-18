public class RecursionBasics {

    //print from 5 to 1

    static void printFiveToOne(int n) {
        if (n == 0)
            return;
        else
            System.out.println(n);
        printFiveToOne(n-1);
    }


    static void printOneToFive(int n) {
        if (n==0)
            return;
        else
            printOneToFive(n-1);
        System.out.println(n);
    }

    // print sum of first n numbers

    static int printSum(int n, int sum) {
        if (n==0) return sum;
        return printSum(n-1,sum+n);
    }
    // alternative of sum of first n natural numbers using recursion

    static int nSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + nSum(n -1);
        // when we have this kind of statement, we wait till the final return statement has returned the value so the initial function call
        // is able to return the value for the previous call
    }
    // fact of a number
    static int printFact(int n) {
        if (n==0 || n==1)
            return 1;
        return n * printFact(n-1);
    }

    // sum of the digits in a number

    static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumOfDigits(n/10);
    }

    static int productOfDigits(int n) {
        if (0 == n)
            return 1;
            return n % 10 * productOfDigits(n/10);
    }

    // reverse of a number
    static int sum = 0;
    static void reverseNumber(int n) {
        if (n == 0)
            return ;
            int digit = n % 10;
            sum = sum * 10 + digit;

         reverseNumber(n/10);
    }


    // simple function to reverse
    /*    int rev = 0;
    int lastDigit = n % 10;
    rev = rev * 10 + lastDigit;
    n = n /10;
    */

    // reverse of a number by pure recursion with helper function
    static int rev2(int n) {
        if (n % 10 == n) {
            return n;
        }
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n, digit);
    }

    private static int helper(int n, int digit) {
        if(n == 0)
            return 0;
        int rem = n % 10;
        // rem = rem * 10^digit + digit
        return rem * (int)Math.pow(10, digit) +  helper(n/10, digit -1);
    }

    // to check whether a number is palindrome or not by pure recursion

    static int rev3 (int n) {
        if (n % 10 == n) return n;
        int numberOfDigits = (int)(Math.log10(n)) + 1;
        return helper3(n, numberOfDigits);
    }
    static int helper3 (int n, int numberOfDigits) {
        int lastDigit = n % 10;
        return (int)(Math.pow(10, numberOfDigits)) + helper(n/10, numberOfDigits -1);
    }


    // count number of zeros in a number

    static int countZeros(int n, int count) {
        if ( n == 0 ) return count;
        int digit = n % 10;
        if (digit == 0)
            return countZeros(n / 10, count +1);
        return countZeros(n / 10, count);
    }

    public static void main(String[] args) {
//        int x  = 00;
//        if (x == rev3(x))
//            System.out.println("Palindrome");
//        else
//            System.out.println( "Not a Palindrome");
        int res = countZeros(0, 0);
        System.out.println(res);
    }
}

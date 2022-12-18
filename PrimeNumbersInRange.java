public class PrimeNumbersInRange {
    public static void main(String[] args) {
//         int a = 4;
//         int b = 329959447;
//         primeNumbersInRange(a, b);
            int a = 100;
            int ans = sumTillN2(a);
        System.out.println(ans);
    }
    static void primeNumbersInRange(int a, int b) {
            if (a % 2==0 )
                a++;
        for (int i = a; i < b; i +=2) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n) {
        int i = 2;
        while(i * i <= n) {
            if (n % i ==0){
                return false;
            } i ++;
        }
        return true;

    }

    static int sumTillN(int n, int sum) {
        if (n == 0) {
            return sum;
        }
         return sumTillN(n-1, sum + n );
    }
    static int sumTillN2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) { // inclusive
            sum += i;
        }
        return sum;
    }
}

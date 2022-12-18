public class IsPrimeInARange {

    public static void main(String[] args) {

    int n = 40;
    boolean[] primes = new boolean[n + 1];
    seive(n,primes);


    }

    static void seive (int n, boolean[] primes){
        int i = 2;
        while(i * i <= n) {
            if(!primes[i]){
                for(int j = i*2; j<=n ; j+=i){
                    primes[j] = true;
                }
            }

        }

        for (int z = 2; z<= n; z++) {
            if (!primes[z]) {
                System.out.println(z + " ");
            }

        }
    }
}

public class Primes {

    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);

        // Boolean array representing primality
        boolean[] isPrime = new boolean[N + 1];

        // initialize: assume all numbers >1 are prime
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= N; p++) {
            if (isPrime[p]) {
                // Cross out multiples of p
                for (int multiple = 2 * p; multiple <= N; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        // print all primes and count them
        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }

        // percentage
        double percent = ((double) (count) / (double) (N)) * 100;
        System.out.println("There are " + count + " primes between 2 and " + N +
                " (" + (int) percent + "% are primes)");
    }
}
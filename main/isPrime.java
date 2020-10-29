public class isPrime {
    public static boolean[] Prime(int range) {
        boolean[] prime = new boolean[range + 1];
        for (int i = 0; i < range; i++)
            prime[i] = true;

        for (int p = 2; p * p <= range; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * p; i <= range; i += p)
                    prime[i] = false;
            }
        }

        return prime;
    }
}
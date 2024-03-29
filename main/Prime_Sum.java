public class Prime_Sum {

    public Prime_Sum() {
        int n = 2000000;
        long result = 0L;
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            prime[i] = true;

        for (int p = 2; p * p < n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i < n; i += p)
                    prime[i] = false;
            }
        }

        for (int i = 2; i < n; i++) {
            if (prime[i] == true) {
                result += i;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Prime_Sum();
    }
}
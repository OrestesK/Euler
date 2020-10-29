public class Consecutive_Prime_Sum {

    public static void main(String[] args) {
        final int MAX_SUM = 1000000;
        int currentSum = 0, currentNumber = 6;
        for (currentNumber = 0; currentSum + currentNumber < MAX_SUM; currentNumber++) {
            if (isPrime(currentNumber)) {
                currentSum += currentNumber;
            }
        }
        System.out.println(currentSum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 && n != i) {
                return false;
            }
        }
        return true;
    }
}

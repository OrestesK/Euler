public class Prime_Number {

    public Prime_Number() {
        int primeCount = 0, divisors = 0, result = 0; // variables
        for (int i = 1; primeCount <= 10001; i++) { // starts at 2 until it reaches the 10001 prime number
            divisors = 0;
            for (int j = 2; j < i / 2 + 1; j++) { // divides the number by all numnbers up to its half excluding itself
                if (i % j == 0 && j != i) {
                    divisors++;
                }
            }
            if (!(divisors > 0)) { // checks if it is prime, if it is it adds 1 to primeCount and sets result to
                                   // that number
                primeCount++;
                result = i;
            }

        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Prime_Number();
    }
}
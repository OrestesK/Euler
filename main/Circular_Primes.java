import java.util.ArrayList;

public class Circular_Primes {
    public Circular_Primes() {
        ArrayList<Integer> circularPrimes = new ArrayList<Integer>();
        ArrayList<Integer> primes = primes(1000000);
        primes.remove(0);// removes 0
        primes.remove(0);// removes 1

        for (int i = 0; i < primes.size(); i++) {
            ArrayList<Integer> rotations = rotate(primes.get(i));
            int primesIn = 0;
            for (int l = 0; l < rotations.size(); l++) {
                if (primes.contains(rotations.get(l))) {
                    primesIn++;
                }
            }
            if (primesIn == rotations.size()) {
                circularPrimes.add(primes.get(i));
            }
        }

        System.out.println(circularPrimes.toString());
        System.out.println("");
        System.out.println(circularPrimes.size());
        // System.out.println(primes.size());
    }

    public static void main(String[] args) {
        new Circular_Primes();
    }

    private ArrayList<Integer> rotate(int number) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int digits = String.valueOf(number).length();
        int powTen = (int) Math.pow(10, digits - 1);

        for (int i = 0; i < digits - 1; i++) {
            int firstDigit = number / powTen;
            int newNum = ((number * 10) + firstDigit) - (firstDigit * powTen * 10);
            temp.add(newNum);
            number = newNum;
        }
        return temp;
    }

    private ArrayList<Integer> primes(int range) {
        boolean[] prime = new boolean[range + 1];
        for (int i = 0; i < range; i++)
            prime[i] = true;

        for (int p = 2; p * p <= range; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= range; i += p)
                    prime[i] = false;
            }
        }

        ArrayList<Integer> returned = new ArrayList<Integer>();
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == true) {
                returned.add(i);
            }
        }
        return returned;
    }
}
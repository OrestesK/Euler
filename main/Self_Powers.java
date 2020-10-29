import java.math.BigInteger;

public class Self_Powers {

    public Self_Powers() {
        BigInteger result;
        for (int i = 1; i <= 1000; i++) {
            result += BigInteger.pow(i);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Self_Powers();
    }
}
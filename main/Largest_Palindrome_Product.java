public class Largest_Palindrome_Product {

    public Largest_Palindrome_Product() {
        int highest = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int temp = j * i;

                String sTemp = String.valueOf(temp);
                StringBuilder builder = new StringBuilder();
                builder.append(sTemp);

                builder = builder.reverse();

                String reverse = builder.toString();

                if (sTemp.equals(reverse)) {
                    if (temp > highest) {
                        highest = temp;
                    }
                }
            }
        }
        System.out.println(highest);
    }

    public static void main(String[] args) {
        new Largest_Palindrome_Product();
    }
}
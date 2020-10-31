import java.util.ArrayList;

public class Sub_String_Divisibility {
    static ArrayList<String> pandigitals = new ArrayList<String>();
    static ArrayList<String> realPandigitals = new ArrayList<String>();

    public Sub_String_Divisibility() {
        long sum = 0;
        permute("0123456789", 0, 9);

        for (int i = 0; i < pandigitals.size(); i++) {
            String number = pandigitals.get(i);
            String joined = "";
            ArrayList<Character> characters = new ArrayList<Character>();

            for (int l = 0; l < 10; l++) {
                characters.add(number.charAt(l));
            }

            joined = Character.toString(characters.get(1)) + Character.toString(characters.get(2))
                    + Character.toString(characters.get(3));

            if (Integer.valueOf(joined) % 2 == 0.0) {
                joined = Character.toString(characters.get(2)) + Character.toString(characters.get(3))
                        + Character.toString(characters.get(4));
                if (Integer.valueOf(joined) % 3 == 0.0) {
                    joined = Character.toString(characters.get(3)) + Character.toString(characters.get(4))
                            + Character.toString(characters.get(5));
                    if (Integer.valueOf(joined) % 5 == 0.0) {
                        joined = Character.toString(characters.get(4)) + Character.toString(characters.get(5))
                                + Character.toString(characters.get(6));
                        if (Integer.valueOf(joined) % 7 == 0.0) {
                            joined = Character.toString(characters.get(5)) + Character.toString(characters.get(6))
                                    + Character.toString(characters.get(7));
                            if (Integer.valueOf(joined) % 11 == 0.0) {
                                joined = Character.toString(characters.get(6)) + Character.toString(characters.get(7))
                                        + Character.toString(characters.get(8));
                                if (Integer.valueOf(joined) % 13 == 0.0) {
                                    joined = Character.toString(characters.get(7))
                                            + Character.toString(characters.get(8))
                                            + Character.toString(characters.get(9));
                                    if (Integer.valueOf(joined) % 17 == 0.0) {
                                        realPandigitals.add(number);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < realPandigitals.size(); i++) {
            realPandigitals.set(i, realPandigitals.get(i).trim());
            sum += Long.parseLong(realPandigitals.get(i));
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        new Sub_String_Divisibility();
    }

    private void permute(String str, int l, int r) {
        if (l == r) {// && !pandigitals.contains(str)) (LITERALLY TAKES TOO LONG TO CHECK)
            pandigitals.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
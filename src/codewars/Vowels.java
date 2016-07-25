package codewars;

/**
 *
 * @author trav
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, and u as vowels for this Kata.
 */
public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] charArrayOfStr = str.toCharArray();
        for (int i = 0; i < charArrayOfStr.length; i++) {
            if (charArrayOfStr[i] == 'a' || charArrayOfStr[i] == 'e'
                    || charArrayOfStr[i] == 'i' || charArrayOfStr[i] == 'o'
                    || charArrayOfStr[i] == 'u') {
                vowelsCount++;
            }

        }
        return vowelsCount;
    }
}

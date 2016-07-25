package codewars;

import java.util.TreeSet;

/**
 *
 * @author trav Take 2 strings s1 and s2 including only letters from ato z.
 * Return a new sorted string, the longest possible, containing distinct
 * letters, - each taken only once - coming from s1 or s2.
 *
 * EXAMPLE 
 * a = "xyaabbbccccdefww" 
 * b = "xxxxyyyyabklmopq" 
 * longest(a, b) -> "abcdefklmopqwxy"
 *
 * a = "abcdefghijklmnopqrstuvwxyz" 
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */
public class TwoToOne {

    public static String longest(String s1, String s2) {

        TreeSet<Character> first = new TreeSet<>();
        char[] firstChar = s1.toCharArray();
        char[] secondChar = s2.toCharArray();

        for (char theChar : firstChar) {
            first.add(theChar);
        }

        for (char theChar : secondChar) {
            first.add(theChar);
        }

        StringBuilder theString = new StringBuilder();
        for (char theChar : first) {
            theString.append(theChar);
        }
        return theString.toString();
    }
}

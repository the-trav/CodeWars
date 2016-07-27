package codewars;
import java.util.*;

/**
 * Given two arrays of strings a1 and a2 return a sorted array r in
 * lexicographical order and without duplicates of the strings of a1 which are
 * substrings of strings of a2.
 *
 * Example 1:
 *
 * a1 = ["arp", "live", "strong"]
 *
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 *
 * returns ["arp", "live", "strong"]
 *
 * Example 2:
 *
 * a1 = ["tarp", "mice", "bull"]
 *
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 *
 * returns []
 *
 * @author trav
 */
public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> theSet = new TreeSet<>();
        for (String currentArray1 : array1) {
            for(String currentArray2 : array2){
                if(currentArray2.contains(currentArray1)){
                    theSet.add(currentArray1);
                }
            }//end innerloop
        }
        return theSet.toArray(new String[theSet.size()]);
    }

}

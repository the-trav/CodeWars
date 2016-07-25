/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author trav
 * Your task is to make a function that can take any non-negative
 * integer as a argument and return it with it's digits in descending order.
 * Descending order means that you take the highest digit and place the next
 * highest digit immediately after it.
 *
 * Examples:
 *
 * Input: 145263 Output: 654321
 *
 * Input: 1254859723 Output: 9875543221
 */
public class DescendingOrder {

    public static int sortDesc(final int num) {
        ArrayList<String> numberList = new ArrayList<>();
        char[] numberInCharArray = String.valueOf(num).toCharArray();

        for (char singleDigit : numberInCharArray) {
            numberList.add(String.valueOf(singleDigit));
        }
        Collections.sort(numberList);
        Collections.reverse(numberList);
        StringBuilder builder = new StringBuilder();
        for (String digit : numberList) {
            builder.append(digit);
        }
        return Integer.valueOf(builder.toString());
    }
}

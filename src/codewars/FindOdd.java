/*
Given an array, find the int that appears an odd number of times.
There will always be only one integer that appears an odd number of times.
 */
package codewars;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
   public static int findIt(int[] A) {
       int odd=0;
       Map<Integer,Integer> countMap = new HashMap<>();
       for(int currentInt : A){
           if(countMap.containsKey(currentInt)){
               int theValue = countMap.get(currentInt);
               countMap.replace(currentInt, theValue+1);
           }else{
                countMap.put(currentInt, 1);
            }
       }
       for(Map.Entry<Integer,Integer> currentEntry : countMap.entrySet()){
           if( (currentEntry.getValue()%2)!= 0 ){
               odd = currentEntry.getKey();
           }
       }
  	return odd;
  }
}

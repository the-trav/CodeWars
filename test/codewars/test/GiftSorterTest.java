/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars.test;

import codewars.GiftSorter;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trav
 */
    
 public class GiftSorterTest {
    
    @Test
    public void simpleTests1() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("sort fedcba", "abcdef", gs.sortGiftCode("fedcba"));
    }
    
    @Test
    public void simpleTests2() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("already sorted", "abcdef", gs.sortGiftCode("abcdef"));
    }
    
    @Test
    public void simpleTests3() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("middle of alphabet", "kpqsuvy", gs.sortGiftCode("pqksuvy"));
    }
    
    @Test
    public void simpleTests4() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("reverse alphabet", "abcdefghijklmnopqrstuvwxyz", gs.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }
    
    @Test
    public void simpleTests5() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("just one char", "z", gs.sortGiftCode("z"));
    }
 
}


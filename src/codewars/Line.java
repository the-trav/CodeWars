package codewars;


/**
 *
 * @author trav 
 * The new "Avengers" movie has just been released! There are a lot
 * of people at the cinema box office standing in a huge line. Each of them has
 * a single 100, 50 or 25 dollars bill. A "Avengers" ticket costs 25 dollars.
 *
 * Vasya is currently working as a clerk. He wants to sell a ticket to every
 * single person in this line.
 *
 * Can Vasya sell a ticket to each person and give the change if he initially
 * has no money and sells the tickets strictly in the order people follow in the
 * line?
 *
 * Return YES, if Vasya can sell a ticket to each person and give the change.
 * Otherwise return NO.
 *
 * EXAMPLE Line.Tickets(new int[] {25, 25, 50}) => YES Line.Tickets(new int
 * []{25, 100}) => NO
 */
public class Line {
//IMPORTANT TO READ DESCRIPTION 
// ->Each of them has a single 100, 50 or 25 dollars bill. <-
    public static String Tickets(int[] peopleInLine) {
        int twentyFiveBill = 0;
        int fiftyBill = 0;
        int hundredBill = 0;
        if (peopleInLine[0] > 25) {//if first person in line has more then 25$ the clerk is unable to provide change
            return "NO";
        } else {
            twentyFiveBill++;//we know clerk will have 25 in cash
        }
        for (int i = 1; i < peopleInLine.length; i++) {
            switch (peopleInLine[i]) {//if customer has 25, just add it to the bank
                case 25:
                    twentyFiveBill++;
                    break;
                case 50://if customer has a 50 bill then accept and return them a 25 bill if possible
                    fiftyBill++;
                    if (twentyFiveBill < 0) {
                        return "NO";
                    } else {
                        twentyFiveBill--;
                    }
                    break;
                case 100://if customer has a 100 bill then accept it and return them either (1 50 bill & 1 25 bill) OR 3 25bill if possible
                    hundredBill++;
                    if (fiftyBill > 0 && twentyFiveBill >= 1) {//two ways to cash a 100 with change
                        fiftyBill--;
                        twentyFiveBill--;
                    } else if (twentyFiveBill >= 3) {
                        twentyFiveBill -= 3;
                    } else {
                        return "NO";
                    }
                    break;
                default:
                    break;
            }
        }
        return "YES";
    }

}

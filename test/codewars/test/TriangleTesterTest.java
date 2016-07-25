
package codewars.test;
import codewars.TriangleTester;
import static org.junit.Assert.*;
import org.junit.Test;


public class TriangleTesterTest {
    @Test
    public void publicTests() {
        assertEquals(TriangleTester.isTriangle(1,2,2), true);
        assertEquals(TriangleTester.isTriangle(7,2,2), false);
    }
    
    @Test
    public void changingSidesTest() {
        assertEquals(TriangleTester.isTriangle(1,2,3), false);
        assertEquals(TriangleTester.isTriangle(1,3,2), false);
        assertEquals(TriangleTester.isTriangle(3,1,2), false);
        
        assertEquals(TriangleTester.isTriangle(1,2,5), false);
        assertEquals(TriangleTester.isTriangle(1,5,2), false);
        assertEquals(TriangleTester.isTriangle(5,1,2), false);
    }
    
    @Test
    public void triangleTypes() {
        assertEquals(TriangleTester.isTriangle(4,2,3), true);
        assertEquals(TriangleTester.isTriangle(5,1,5), true);
        assertEquals(TriangleTester.isTriangle(2,2,2), true);
    }
    
    @Test
    public void NegativeTypes() {
        assertEquals(TriangleTester.isTriangle(-1,2,3), false);
        assertEquals(TriangleTester.isTriangle(1,-2,3), false);
        assertEquals(TriangleTester.isTriangle(1,2,-3), false);
        assertEquals(TriangleTester.isTriangle(-5,1,3), false);
        assertEquals(TriangleTester.isTriangle(0,2,3), false);
    }
}
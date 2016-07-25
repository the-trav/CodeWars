package codewars.test;

import codewars.Circle;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.Test;

public class CircleTest {
	
  @Test
  public void testKnownValues() {
    try {
      Circle.area(0);
      fail("Radius of 0 should throw an IllegalArgumentException");
    } catch(IllegalArgumentException iae) {}
    for(int i = 0; i < 3; i++) {
      double x = Math.random() * 100;
      double y = 0 - x * Math.random() * 100;
      assertEquals("Wrong area for radius: " + x, (new BigDecimal(Math.PI * x * x)).setScale(2, RoundingMode.HALF_UP).doubleValue(), Circle.area(x), 0.01);
      try {
        Circle.area(y);
        fail("Radius of " + y + " should throw an IllegalArgumentException");
      } catch(IllegalArgumentException iae) {}
      
    }
  }
}
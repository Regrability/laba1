package demo.parallel.test;

import static org.junit.jupiter.api.Assertions.*;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
public class CTest {
    @Test
    public void testPlus() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 2);
        Complex result = a.plus(b);
        assertEquals(3.0, result.getRe());
        assertEquals(3.0, result.getIm());
    }

    @Test
    public void testMinus() {
        Complex a = new Complex(5, 5);
        Complex b = new Complex(3, 3);
        Complex result = a.minus(b);
        assertEquals(2.0, result.getRe());
        assertEquals(2.0, result.getIm());
    }

    @Test
    public void testTimes() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 3);
        Complex result = a.times(b);
        assertEquals(-1.0, result.getRe());
        assertEquals(5.0, result.getIm());
    }

    @Test
    public void testDiv() {
        Complex a = new Complex(5, 5);
        Complex b = new Complex(1, 1);
        Complex result = a.div(b);
        assertEquals(5.0, result.getRe());
        assertEquals(0.0, result.getIm());
    }

    @Test
    public void testLengthSQ() {
        Complex a = new Complex(3, 4);
        assertEquals(25.0, a.lengthSQ());
    }
}

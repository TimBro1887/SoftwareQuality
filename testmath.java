package testing;

import org.junit.Assert;
import org.junit.Test;
/*
junit test class to test the basic four math operations
imports are needed for junit testing
 */
public class testmath {
    //tests addition, the correctness of result is tested with asserTrue
    @Test public void testadd(){
        double result = math.add(10.0, 3.0);
        Assert.assertTrue(13.0 == result);
    }
    //tests substraction, the correctness of result is tested with asserTrue
    @Test public void testsubstract() {
        double result = math.subtract(10.0, 3.0);
        Assert.assertTrue(7.0 == result);
    }
    //tests multiplication, the correctness of result is tested with asserTrue
    @Test public void testmultiply() {
        double result = math.multiply(10.0, 3.0);
        Assert.assertTrue(30.0 == result);
    }
    //tests division, checks if the exception works
    @Test(expected = ArithmeticException.class) public void testdivide() {
        double result = math.divide(10.0, 0);
    }
    //tests division, the correctness of result is tested with asserTrue
    @Test public void testdivide1() {
        double result = math.divide(10.0, 2.0);
        Assert.assertTrue(5.0 == result);
    }
}

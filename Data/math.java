package testing;
/*
Java Class which includes the four basic math operations
created for exercise 02 in order to do simple junit testing
 */
public class math {
    //method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    //method for substraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    //method for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    //method for division, includes exception if division with 0 is tried
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }
}

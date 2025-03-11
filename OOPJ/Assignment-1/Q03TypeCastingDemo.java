public class Q03TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit Type Casting 
        int intValue = 100;
        double doubleValue = intValue; // Coverting int to double
        System.out.println("Implicit Type Casting (int to double): " + doubleValue);

        // Explicit Type Casting 
        double DoubleValue2 = 99.99;
        int IntValue2 = (int) DoubleValue2; // conerting double to int
        System.out.println("Explicit Type Casting (double to int): " + anotherIntValue);


        int charCode = 65;
        char charValue = (char) charCode; // Converting int to char
        System.out.println("Explicit Type Casting (int to char): " + charValue);
    }
}

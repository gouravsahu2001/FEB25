public class Q04WrapperClassConversion {
    public static void main(String[] args) {
        
        Integer intValue = 100;
        Double doubleValue = intValue.doubleValue();
        System.out.println("Converted Integer to Double: " + doubleValue);

        
        Double DoubleValue2 = 99.99;
        Integer IntValue2 = DoubleValue2.intValue();
        System.out.println("Converted Double to Integer: " + IntValue2);
    }
}

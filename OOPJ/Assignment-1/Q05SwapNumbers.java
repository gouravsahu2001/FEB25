
class Q05SwapNumbers {
    public static void main(String[] args) {
        int num=10;
        int num2=20;
        // swapping
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping using a temporary variable: num1 = " + num1 + ", num2 = " + num2);

        
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping without using a temporary variable: num1 = " + num1 + ", num2 = " + num2);
        
        
    }
}

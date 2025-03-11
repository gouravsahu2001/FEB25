import java.util.Scanner;

class Q02ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two integer inputs
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = (num2 != 0) ? num1 / num2 : 0;
        int remainder = (num2 != 0) ? num1 % num2 : 0;

        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

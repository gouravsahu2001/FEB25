import java.util.Scanner;

class Q06VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        }
        else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a consonant.");
        }
        else {
            System.out.println("Invalid input. Please enter an alphabetic character.");
        }
  
    }
}

class Q07EvenOddChecker {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java EvenOddChecker <number>");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
        }
    }
}

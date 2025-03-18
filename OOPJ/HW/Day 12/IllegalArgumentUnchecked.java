
class AgeValidation {
    
    public static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Invalid age: " + age + ". Age must be between 0 and 150.");
        }
        System.out.println("Age set to: " + age);
    }

class IllegalArgumentUnchecked {

	public static void main(String[] args) {
		try {
            AgeValidation.setAge(25);  // Valid age
            AgeValidation.setAge(-5);  // Invalid age, will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            setAge(200); // one more Invalid case
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
		
	}

}
}

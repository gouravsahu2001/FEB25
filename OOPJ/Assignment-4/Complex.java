class Complex {
    private double real;
    private double imag;

   
    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(double real) {
        this.real = real;
        this.imag = 0;
    }

 
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

   
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    
    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imag * other.imag;
        double imagPart = this.real * other.imag + this.imag * other.real;
        return new Complex(realPart, imagPart);
    }

  
    public void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }

    public static void main(String[] args) {
        
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(4, -2);

        // Adding the two complex numbers
        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();

        // Multiplying the two complex numbers
        Complex product = c1.multiply(c2);
        System.out.print("Product: ");
        product.display();
    }
}

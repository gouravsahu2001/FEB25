interface A {
    void show();
}

interface B {
    void show();
}

class C implements A, B {
    public void show() {
        System.out.println("Hello from C");
    }

    void display() {
        System.out.println("Good Morning..!");
    }
}

class DiamondProblemSolution {
    public static void main(String args[]) {
        C c = new C();
        c.show();
        c.display();
    }
}

public class SuperSubClass {
    public static void main(String[] args) {
        SubSubClass sub = new SubSubClass();
        sub.add(5, 3);
        sub.multiply(5, 3);
        sub.subtract(5, 3);
    }
}

class SuperClass {
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

class SubClass extends SuperClass {
    public void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }
}

class SubSubClass extends SubClass {
    public void subtract(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }
}
// parameter passing using inheritance (to perform addition of 2 numbers using eat method and multiplication using bark method)

class Animal {
    int num1;
    int num2;

    Animal(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void eat() {
        System.out.println("Sum: " + (num1 + num2));
    }
}

class Dog extends Animal {
    Dog(int num1, int num2) {
        super(num1, num2);
    }

    void bark() {
        System.out.println("Product: " + (num1 * num2));
    }
}

class parameterPassing {
    public static void main(String[] args) {
        Dog d = new Dog(10, 20);
        d.eat();
        d.bark();
    }
}
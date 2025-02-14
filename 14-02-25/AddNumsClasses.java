//addition of 2 nums in class 1 and multiplication in class 2. apply method overriding, using super keyword
class Add {
    int a, b, c;
    void Calc(int a, int b) {
        this.a = a;
        this.b = b;
        c = a + b;
        System.out.println("Addition: " + c);
    }
}

class Mul extends Add {
    int a, b, c;
    void Calc(int a, int b) {
        super.Calc(a, b);
        this.a = a;
        this.b = b;
        c = a * b;
        System.out.println("Multiplication: " + c);
    }
}

class AddNumsClasses {
    public static void main(String args[]) {
        Mul m = new Mul();
        m.Calc(10, 20);
    }
}
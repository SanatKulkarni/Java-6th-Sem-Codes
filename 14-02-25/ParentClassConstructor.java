//java program to invoke parent class constructor using super keyword
class One {
    int i;

    One(int i) {
        this.i = i;
        System.out.println("Parent class constructor called");
    }
}

class Two extends One {
    Two() {
        super(10);
        System.out.println("Child class constructor called");
    }

    void show() {
        System.out.println("Value of i: " + i);
    }
}

class Method {
    public static void main(String[] args) {
        Two t = new Two();
        t.show();
    }
}
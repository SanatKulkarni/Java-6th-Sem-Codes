class One {
    int i = 10;
}

class Two extends One {
    int i = 20;

    void show() {
        System.out.println(super.i);
    }
}

class Method {
    public static void main(String[] args) {
        Two t = new Two();
        t.show();
    }
}
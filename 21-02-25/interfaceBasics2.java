// first interface name showable with method name show, second interface name printable with method name print
//by using show method, print hello show on display, and using print method, print hello print on display
//apply multiple inheritance

interface showable{
    void show();
}

interface printable{
    void print();
}

class interfaceBasics2 implements showable, printable{
    public void show(){
        System.out.println("Hello show");
    }

    public void print(){
        System.out.println("Hello print");
    }

    public static void main(String[] args){
        interfaceBasics2 obj = new interfaceBasics2();
        obj.show();
        obj.print();
    }
}

class Person{
    String name="ramu";
    int age=20;
    void display(){
        System.out.println(name+" "+age);
    }
    Person(){
        display();
    }
}

class anotherDefConstructor{
    public static void main(String args[]){
        Person obj=new Person();
    }
}
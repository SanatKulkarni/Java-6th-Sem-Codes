class Person{
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name+" "+age);
    }
}

class parConstructor{
    public static void main(String args[]){
        Person obj=new Person("ramu", 20);
        obj.display();
    }
}
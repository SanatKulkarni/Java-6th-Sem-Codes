//java program to implement constructor overloading

class One{
    One(int a,int b){
        int c=a+b;
        System.out.println("Addition: "+c);
    }

    One(int a,int b, int d){
        int c=a+b+d;
        System.out.println("Addition: "+c);
    }
}

class ConstructorOverloadingBasics{
    public static void main(String args[]){
        One o1=new One(10,20);
        One o2=new One(10,20,30);
    }
}
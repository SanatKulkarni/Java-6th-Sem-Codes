class A{
        int x;
        A(int x){
            this.x = x;
        }
    }

class objectBasics{
    public void printX(A a){
        System.out.println(a.x);
    }
    public static void main(String args[]){
        A a = new A(10);
        objectBasics obj = new objectBasics();
        obj.printX(a);
    }
}
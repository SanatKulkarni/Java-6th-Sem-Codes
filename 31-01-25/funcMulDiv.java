class funcMulDiv{
    int mul(int a, int b){
        return a*b;
    }
    int div(int a, int b){
        return a/b;
    }
    public static void main(String args[]){
        funcMulDiv obj=new funcMulDiv();
        System.out.println("Multiplication= "+obj.mul(5,2));
        System.out.println("Division= "+obj.div(5,2));
    }
}
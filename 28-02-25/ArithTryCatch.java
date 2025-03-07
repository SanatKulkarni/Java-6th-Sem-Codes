//java program to implement arithmetic exception using try and catch block

class ArithTryCatch{
    public static void main(String[] args) {
        try {
            int a=10/0;
            System.out.print(a);
        } catch (ArithmeticException e) {
            System.out.println("Exception: "+e);
        }
    }
}
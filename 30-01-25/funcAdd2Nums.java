import java.util.*;
class funcAdd2Nums{
    static void sum(int a,int b){
        int c=a+b;
        System.out.println("Addition= "+c);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a,b);
    }
}
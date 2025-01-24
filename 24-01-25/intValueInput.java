import java.io.*;
class intValueInput{
    public static void main(String args[])throws IOException{
        System.out.println("Enter Number brother: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int a=Integer.parseInt(s);
        System.out.println("Number is: "+a);
    }
}
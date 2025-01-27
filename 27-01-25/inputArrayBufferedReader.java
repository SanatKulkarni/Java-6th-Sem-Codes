import java.io.*;
class inputArrayBufferedReader{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[5];
        for(int i=0; i<5; i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0; i<5; i++){
            System.out.println(a[i]);
        }
    }
}
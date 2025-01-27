import java.io.*;
class twoDArrayBuffer{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[][]=new int[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
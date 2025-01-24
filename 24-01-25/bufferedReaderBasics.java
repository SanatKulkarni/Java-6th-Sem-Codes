import java.io.*;
class bufferedReaderTesting{
    public static void main(String[] args) throws IOException{
        System.out.println("Enter Name: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println("Name is: " + name);
    }
}
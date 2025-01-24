import java.io.*;
class empDetails{
    public static void main(String args[])throws IOException{
            System.out.println("Enter Employee Name: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String name = br.readLine();
            System.out.println("Enter Employee ID: ");
            String id = br.readLine();
            int empID = Integer.parseInt(id);
            System.out.println("Enter Employee Salary: ");
            String salary = br.readLine();
            float empSalary = Float.parseFloat(salary);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + empID);
            System.out.println("Employee Salary: " + empSalary);
    }
}

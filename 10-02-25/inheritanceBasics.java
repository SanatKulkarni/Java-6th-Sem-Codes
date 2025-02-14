//extend salary field from employee class to programmer class

class Employee {
    float salary = 40000;
}

class inheritanceBasics  extends Employee{
    int bonus = 10000;
    public static void main(String[] args) {
        inheritanceBasics p = new inheritanceBasics();
        System.out.println("Programmer salary is: " + p.salary);
        System.out.println("Programmer bonus is: " + p.bonus);
    }
}
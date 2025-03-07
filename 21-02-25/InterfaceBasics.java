//java program to declare interface college and abstract method department, to print srm on display

interface College{
    void department();
}

class InterfaceBasics implements College{
    public void department(){
        System.out.println("SRM");
    }
    public static void main(String args[]){
        InterfaceBasics obj=new InterfaceBasics();
        obj.department();
    }
}
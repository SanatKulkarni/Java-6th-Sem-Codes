class Student{
    int hindi=90;
    int english=80;
    int math=70;
}

class College{
    int hindi=80;
    int english=70;
    int math=60;
}

class userDefinedClassBasics{
    public static void main(String args[]){
        Student s=new Student();
        System.out.println(s.hindi);
        College c=new College();
        System.out.println(c.hindi);
    }
}
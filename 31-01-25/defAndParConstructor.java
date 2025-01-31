class College{
    College(){
        System.out.println("SRM Chennai");
    }
    College(String name,String place){
        System.out.println(name+" "+place);
    }
}

class defAndParConstructor{
    public static void main(String args[]){
        College obj1=new College();
        College obj2=new College("VIT","Vellore");
    }
}
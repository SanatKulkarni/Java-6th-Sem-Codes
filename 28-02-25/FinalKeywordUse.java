class One{
    final void show(){
        System.out.println("Show of One");
    }
}

class Two extends One{
    void show(){
        System.out.println("Show of Two");
    }
}

public class FinalKeywordUse{
    public static void main(String[] args){
        Two obj = new Two();
        obj.show();
    }
}
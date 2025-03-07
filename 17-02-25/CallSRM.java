import vitmul.VitMul;
import amrutasub.AmrutaSub;
class CallSRM{
    public static void main(String[] args){
        VitMul v = new VitMul();
        AmrutaSub a = new AmrutaSub();
        System.out.println("Product: "+v.mul(5, 3));
        System.out.println("Difference: "+a.sub(5, 3));
    }
}

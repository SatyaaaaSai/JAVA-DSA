package OOPPrinciples.Inheritance;

public class BoxWeight extends Box { //Box File Is The Above Box File.Because this is in the package/!\
    public int weight;
    BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(int l, int w, int h, int weight) {
        super(l, w, h);//call The Box Constructor.
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }

    public BoxWeight(int side, int weight) {
        super(side);
        this.weight = weight;
    }

    public static void main(String[] args) {
        BoxWeight obj=new BoxWeight();
        BoxWeight obj2=new BoxWeight(12,13,14,15);
        BoxWeight obj3=new BoxWeight(obj2);
        System.out.println(obj.weight);
        System.out.println(obj2.l+" "+obj2.w+" "+obj2.h+" " + obj2.weight);
        System.out.println("Constructor Calling in super class's "+" " +obj3.l+" "+obj3.w+" "+obj3.h+" " + obj3.weight);
        Box obj4=new BoxWeight(12,12,12,12);
        System.out.println(obj4.l);
    }

}

package OOPPrinciples.Inheritance;

public class Box {

    public int l;
    public int w;
    public int h;

    Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }

    public Box(int side) {
        this.l = side;
        this.w = side;
        this.h= side;
    }

    public Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box b1){
        this.l = b1.l;
        this.w = b1.w;
        this.h = b1.h;
    }

    public static void main(String[] args) {
        Box obj1=new Box();//Empty Constructor Will Be Called.
        Box obj2=new Box(12);//First Parameter Constructor Will be Called.
        Box obj3=new Box(12,13,45);//All Parameters Will Be Called;
        Box obj4=new Box(obj1);//CONSTRUCTOR IN Constructor Called.

        System.out.println(obj1.l+" "+obj1.w+" "+obj1.h);
        System.out.println(obj2.l+" "+obj2.w+" "+obj2.h);
        System.out.println(obj3.l+" "+obj3.w+" "+obj3.h);
        System.out.println(obj4.l+" "+obj4.w+" "+obj4.h);


    }
}

package oopprinciples.inheritance;
public class BoxPrice extends BoxWeight {
//BoxWeight Is The Above File..
    public int cost;
    public BoxPrice(int l, int w, int h, int weight,int cost) {
        super(l, w, h, weight);
        this.cost=cost;
    }
    public BoxPrice(int side,int weight,int cost){
        super(side,weight);
        this.cost=cost;
    }

    public static void main(String[] args) {
        BoxPrice obj=new BoxPrice(12,12,12);
        BoxPrice obj2=new BoxPrice(12,12,12,14,15);
        System.out.println(obj.l+" "+obj.w+" "+obj.h+" "+ obj.cost+" "+ obj.weight);
        System.out.println(obj2.l+" "+obj2.w+" "+obj2.h+" "+ obj2.cost+" "+ obj2.weight);
    }
}
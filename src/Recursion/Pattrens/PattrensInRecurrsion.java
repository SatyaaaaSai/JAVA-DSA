package Recursion.Pattrens;

public class PattrensInRecurrsion {
    public static void main(String[] args) {
        PattrensInRecurrsion obj=new PattrensInRecurrsion();

        obj.triangle(4,0);
        obj.triangle2(4,0);
    }
//pattren1

//            ****
//            ***
//            **
//            *
  public void triangle(int r,int c){
        if(r==0){
            return;
        }

       if(c<r){
            System.out.print("*");
            triangle(r,c+1);
        }
        else{
            System.out.println();
            triangle(r-1,0);
        }
    }


//pattren 2


//            *
//            **
//            ***
//            ****


    public void triangle2(int r,int c){
        if(r==0){
            return;
        }

        if(c<r){
            triangle2(r,c+1);
            System.out.print("*");

        }
        else{
            triangle2(r-1,0);
            System.out.println();

        }
    }
}

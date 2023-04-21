package Recursion.mazeproblems;


import java.util.ArrayList;

//travels Through Diagonal Also..
public class IncludingDiagonalPaths {
    public static void main(String[] args) {
                IncludingDiagonalPaths obj=new IncludingDiagonalPaths();
                System.out.println(obj.printingPathsList("",3,3));
    }

    public ArrayList<String> printingPathsList(String ans, int row, int column){

        if(row==1 && column==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> list=new ArrayList<>();

        if(row>1 && column >1){
            list.addAll(printingPathsList(ans + "D", row - 1, column-1));
        }
        if(row>1) {
            list.addAll(printingPathsList(ans + "V", row - 1, column));
        }
        if(column>1) {
            list.addAll(printingPathsList(ans + "R", row, column - 1));
        }
        return list;
    }

}

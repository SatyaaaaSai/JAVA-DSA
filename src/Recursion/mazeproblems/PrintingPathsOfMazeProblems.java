package Recursion.mazeproblems;

public class PrintingPathsOfMazeProblems {
    public static void main(String[] args) {
            PrintingPathsOfMazeProblems obj=new PrintingPathsOfMazeProblems();
            obj.printingpaths("",3,3);
    }

    public void printingpaths(String ans,int row,int column){

        if(row==1 && column==1){
            System.out.println(ans);
            return;
        }

        if(row>1) {
            printingpaths(ans + "D", row - 1, column);
        }
        if(column>1) {
            printingpaths(ans + "R", row, column - 1);
        }
        }
    }

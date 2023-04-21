package Recursion.mazeproblems;

public class AllPaths {
    public static void main(String[] args) {
                AllPaths obj=new AllPaths();
        boolean [][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
                obj.printingpaths("",maze,0,0);
    }

    public void printingpaths(String ans,boolean[][] maze,int row,int column){

        if(row==maze.length-1 && column==maze[0].length-1){
            System.out.println(ans);
            return;
        }

        if(!maze[row][column]){ //Not Equal Means True.
            return;
        }

        //I AM This Paths SO,Whenever Function Call This Block Became False....
        maze[row][column]=false;

        if(row<maze.length-1) {
            printingpaths(ans + "D", maze,row + 1, column);
        }
        if(column<maze[0].length-1) {
            printingpaths(ans + "R", maze,row, column + 1);
        }
        if(row>0){
            printingpaths(ans+"U",maze,row-1,column);
        }

        if(column>0){
            printingpaths(ans+"L",maze,row,column-1);
        }

        //After This Function, Removes From The Stack
        //Renames That Function To True,Due To BackTracking..

        maze[row][column]=true;
    }
}

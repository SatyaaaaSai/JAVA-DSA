package Recursion.mazeproblems;

public class MazeWithObstacles {

    public static void main(String[] args) {
        MazeWithObstacles obj=new MazeWithObstacles();
        boolean [][] maze={
                {true,true,true},
                {true,false,true},
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

        if(row<maze.length-1) {
            printingpaths(ans + "D", maze,row + 1, column);
        }
        if(column<maze[0].length-1) {
            printingpaths(ans + "R", maze,row, column + 1);
        }
    }

}

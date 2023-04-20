package Recursion.mazeproblems;

public class CountingPathsMazeProblems {
    public static void main(String[] args) {
            CountingPathsMazeProblems obj=new CountingPathsMazeProblems();
        System.out.println(obj.countingPaths(3,3));
    }

    public int countingPaths(int row,int column){
        if(row==1 || column==1){
            return 1;
        }

        int left=countingPaths(row-1,column);
        int right=countingPaths(row,column-1);

        return (right+left);
    }
}

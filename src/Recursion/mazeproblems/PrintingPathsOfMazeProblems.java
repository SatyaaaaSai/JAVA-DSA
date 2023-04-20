package Recursion.mazeproblems;

import java.util.ArrayList;

//Maze Problems Means Either We Will Travel The Maze Space To Either Right or Down
public class PrintingPathsOfMazeProblems {
    public static void main(String[] args) {
            PrintingPathsOfMazeProblems obj=new PrintingPathsOfMazeProblems();
            obj.printingpaths("",3,3);
            System.out.println(obj.printingPathsList("",3,3));
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

        public ArrayList<String> printingPathsList(String ans,int row,int column){

            if(row==1 && column==1){
                ArrayList<String> list=new ArrayList<>();
                list.add(ans);
                return list;
            }

            ArrayList<String> list=new ArrayList<>();
            if(row>1) {
                 list.addAll(printingPathsList(ans + "D", row - 1, column));
            }
            if(column>1) {
                list.addAll(printingPathsList(ans + "R", row, column - 1));
            }
            return list;
        }
    }

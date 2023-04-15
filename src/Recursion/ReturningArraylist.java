package Recursion;

import java.util.ArrayList;

public class ReturningArraylist {
    public static void main(String[] args) {
        ReturningArraylist obj=new ReturningArraylist();
        int[] arr = {1, 2, 3, 4, 4, 5, 6,6,6,6,6};
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans=obj.findInIndex(arr,6,0,list);
        System.out.println(ans);
        System.out.println(obj.findInIndex2(arr,6,0));
    }


    // Returning ArrayList With An Argument ItSelf.
    public ArrayList<Integer> findInIndex (int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length) {
            return list;
        }


        if (arr[index] == target) {
            list.add(index);
        }

        return findInIndex(arr, target, index + 1,list);
    }

    //Returning The ArrayList In Body Of The Function.
    public ArrayList<Integer> findInIndex2 (int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<Integer>();
        if (index == arr.length) {
            return list;
        }


        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findInIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }

}

package Recursion.subset;

import java.util.*;

public class SubSet {
    public static void main(String[] args) {
        SubSet obj=new SubSet();
        int[] arr={1,2,3};
        List<List<Integer>> ans=obj.subset(arr);
        for(List<Integer> i: ans){
            System.out.println(i);
        }
    }

    public List<List<Integer>> subset(int[] arr){

        //For Outer List
        List<List<Integer>> outer=new ArrayList<>();

        //Intially I Have Empty ArrayList.
        outer.add(new ArrayList<>());

        //For Every Number Of Array
        for(int num:arr){
            //Size Is Equal TO the Outer List Of That Particulat Tym.
            int n=outer.size();
            for (int i= 0; i < n; i++) {
                //Internally,We Have Lists..So Create Each And Every InteRnal List For That Particular List...
                List<Integer> internal=new ArrayList<>(outer.get(i));
                //Add Numbers To The Internal List.
                internal.add(num);
                //Add All Internal List To The Outer List..
                outer.add(internal);
            }
        }
        return outer;
    }
}

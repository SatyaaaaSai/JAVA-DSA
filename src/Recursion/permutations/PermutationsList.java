package Recursion.permutations;

import java.util.ArrayList;

public class PermutationsList {

    public static void main(String[] args) {
        PermutationsList obj=new PermutationsList();
        ArrayList<String> ans=obj.permutationsList("","abc");
        System.out.println(ans);

    }

    public ArrayList<String> permutationsList(String ans, String string){

        if(string.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
        //    System.out.println(ans);
            list.add(ans);
            return list;
        }

        char ch=string.charAt(0);

        ArrayList<String> list=new ArrayList<>();


        for (int i = 0; i <= ans.length(); i++) {
            String first=ans.substring(0,i);
            String second=ans.substring(i,ans.length());

           list.addAll(permutationsList(first+ch+second,string.substring(1)));


        }
        return list;
    }
}

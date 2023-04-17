package Recursion.subsequence;

import java.util.ArrayList;

public class SubSequenceUsingArrayList {
    public static void main(String[] args) {
        SubSequenceUsingArrayList obj=new SubSequenceUsingArrayList();
        ArrayList<String> ans=obj.subSeq("","abc");
        System.out.println(ans);
    }

    public ArrayList<String> subSeq(String ans, String string){

        ArrayList<String> list=new ArrayList<String>();

        if(string.isEmpty()){
            list.add(ans);
            return list;
        }

        char ch=string.charAt(0);
        ArrayList<String> Left=subSeq(ans+ch,string.substring(1));
        ArrayList<String> right=subSeq(ans,string.substring(1));

        right.addAll(Left);

      return Left;
      //  return right;
    }
}

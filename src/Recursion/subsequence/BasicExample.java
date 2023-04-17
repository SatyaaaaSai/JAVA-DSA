package Recursion.subsequence;

public class BasicExample {

    public static void main(String[] args) {
        BasicExample obj=new BasicExample();
        obj.subSeq("","abc");
    }

    public void subSeq(String ans,String string){

        if(string.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch=string.charAt(0);
        subSeq(ans+ch,string.substring(1));
        subSeq(ans,string.substring(1));

    }

}

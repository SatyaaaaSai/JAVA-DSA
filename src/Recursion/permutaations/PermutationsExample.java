package Recursion.permutaations;

public class PermutationsExample {
    public static void main(String[] args) {
        PermutationsExample obj=new PermutationsExample();
        obj.permutations("","abc");
    }

    public void permutations(String ans,String string){

        if(string.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch=string.charAt(0);

        //FUNCTIONS Calls Are Depends Upon Ans(process).So We Iterate The For Loop.
        for (int i = 0; i <= ans.length(); i++) {
            String first=ans.substring(0,i); //(0,0)  (0,1)   (0,2) are The Function Calls....
            String second=ans.substring(i,ans.length());

            permutations(first+ch+second,string.substring(1));
        }
    }
}

package Recursion.strings;

public class SkipACharacter {

    public static void main(String[] args) {
        SkipACharacter obj=new SkipACharacter();
        obj.skip("" , "bcccadh");
        String ans=obj.skipWithout("bcccadh");
        System.out.println(ans);
    }

    //Apporach 1
    //Using Another Variable In The Function Called  ans , Used In Recursion Function.
    public void skip(String ans,String string){
        if(string.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch=string.charAt(0);

        if(ch=='a'){
            skip(ans,string.substring(1));
        } else{
            skip(ans+ch,string.substring(1));
        }
    }
    //Apporach 2
    //Without Using Variable Function Ans IN The Recurssion Stack.
    public String skipWithout(String string){
        if(string.isEmpty()){
            return "";
        }

        char ch=string.charAt(0);

        if(ch=='a'){
            return skipWithout(string.substring(1));
        } else{
            return ch+skipWithout(string.substring(1));
        }
    }
}

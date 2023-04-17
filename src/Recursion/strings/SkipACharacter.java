package Recursion.strings;

public class SkipACharacter {

    public static void main(String[] args) {
        SkipACharacter obj=new SkipACharacter();
        obj.skip("" , "bcccadh");
    }

    //Apporach 1
    //Using Another Variable Called ch , Used In Recursion Stack.
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
}

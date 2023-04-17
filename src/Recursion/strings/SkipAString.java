package Recursion.strings;
public class SkipAString {
    public static void main(String[] args) {
        SkipAString obj=new SkipAString();
        System.out.println(obj.skipApple("bccapplecdg"));

    }

    public String skipApple(String string){
        if(string.isEmpty()){
            return "";
        }

        if(string.startsWith("apple")){
            return skipApple(string.substring(5));
        } else{
            return string.charAt(0) +skipApple(string.substring(1));
        }
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber onj= new PalindromeNumber();
       boolean ans= onj.checkPalindrome("acba");
        System.out.println(ans);
    }
    boolean checkPalindrome(String name1) {
        for (int i = 0; i < name1.length() / 2; i++) {
            char start = name1.charAt(1);
            char end = name1.charAt(name1.length() - 1 - i);
            if (start == end) {
                return true;
            }
            }
        return false;
        }
    }

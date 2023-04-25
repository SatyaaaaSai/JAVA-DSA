package LeetCode;

import java.util.Arrays;

public class LC1929 {
    public static void main(String[] args) {
        LC1929 obj=new LC1929();
        int[] numbs = {1,3,2,1};
        int[] ans=obj.getConcatenation(numbs);
        System.out.println(Arrays.toString(ans));
    }
    public int[] getConcatenation(int[] nums) {

        int[] arr=new int[nums.length*2];
        for (int i = 0; i < nums.length*2; i++) {
            if(i<nums.length){
                arr[i]=nums[i];
            }
            else{
                arr[i]=nums[i-nums.length];
            }
        }
        return arr;
    }
}

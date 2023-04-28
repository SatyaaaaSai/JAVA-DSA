package LeetCode;

import java.util.Arrays;

public class LC69 {
    public static void main(String[] args) {
            LC69 obj=new LC69();
            int[] arr={9};
            double ans=obj.arrayToNum(arr);
             System.out.println(ans);
             int[] an=obj.plusOne((int)ans);
             System.out.println(Arrays.toString(an));
    }
    public double arrayToNum(int[] arr){
        int index=0;
        double num=0;
        for (int i =arr.length-1; i >=0; i--) {
            num+=arr[i]*Math.pow(10,index++);
        }
        return num;
    }
    public int[] plusOne(int digits) {
        int n=0;
        int copyOfNumber=digits;
        while(copyOfNumber>0){
            copyOfNumber/=10;
            n++;
        }
        int digit=digits+1;
        int i=n-1;
        int[] arr=new int[n];
        while(digit>0){
            arr[i--]=digit%10;
            digit=digit/10;
        }
        return arr;
    }
}

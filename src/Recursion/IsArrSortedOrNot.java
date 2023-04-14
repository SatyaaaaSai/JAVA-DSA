package Recursion;

public class IsArrSortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        IsArrSortedOrNot obj=new IsArrSortedOrNot();
        System.out.println(obj.sorted(arr,0));
    }

    public static boolean sorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}

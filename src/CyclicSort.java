import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
    int[] arr={3,5,4,2,1};
    sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr)
    {
        int i=0;
        while(i<arr.length){
            int check=arr[i]-1;
            if(arr[check]!=arr[i])
            {
                swap(arr,i,check);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second )
    {
        int temp;
        temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


}
//https://leetcode.com/problems/set-mismatch/
//LC 645:

public class SetMisMatch {
    public static void main(String[] args) {
    }
    public  int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int check = arr[i] - 1;
            if (arr[check] != arr[i]) {
                swap(arr, i, check);
            } else {
                i++;
            }
        }


        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1)  {
                return new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
    void swap ( int[] arr, int first, int second )
    {
        int temp;
        temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

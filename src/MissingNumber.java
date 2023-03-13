
//https://leetcode.com/problems/missing-number/
class MissingNumber {
    public static void main(String[] args) {
        int[] arr={4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int check=arr[i];
            //WeCan Ignore The N(last) value ,Cozz Index Start With 0
            //suppose given array size is 9 it contains only 8 elements
            if(arr[i]<arr.length && arr[check]!=arr[i])
            {
                swap(arr,i,check);
            }
            else {
                i++;
            }
        }

        //search For The Missing Element
        //check for the consecutive elements
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index){
                return index;
            }
        }
        //case2
        //timestamp : 28:00
        //doubtful
        return arr.length;
    }
    static void swap(int[] arr,int first,int second )
    {
        int temp;
        temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
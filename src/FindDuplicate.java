public class FindDuplicate {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] arr) {
            int i=0;
            while(i< arr.length){
                // checks for value=index+1
                if(arr[i]!=i+1){
                    int value=arr[i]-1;
                    if(arr[i]!=arr[value]){
                        swap(arr,i,value)
                    }
                    else{
                        return arr[i]; //return the answer
                    }
                }
                else{
                    i++;
                }
            }

            return -1;
    }

     void swap(int[] arr,int first,int second )
    {
        int temp;
        temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

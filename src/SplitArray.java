public class SplitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int k) {
        int min=0;
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            max+=nums[i];
            min=Math.max(min,nums[i]);
        }

//        int sum=0;
//        int pieces=1;

        while(min<max)
        {
            int mid=(min+max)/2;

            int sum=0;
            int pieces=1;

            for(int num:nums){

                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }
                else {
                    sum+=num;
                }
            }
        if(pieces>k){
            min=mid+1;

        }
        else {
            max=mid;
        }

        }

        return max; // or return min;
    }
}

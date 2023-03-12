//Given Code Is Right
//Just Commenting Out !!

public class EvenDigits {
    public static void main(String[] args) {
            int[] arr={12,345,2,6,7896};
            System.out.println(digits(252525));
    }

    static int findnumbers(int[] nums){
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }

        return count;
    }


    static boolean even(int num)
    {
        int numberOfDigits=digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
            return false;
    }

    static int digits(int num)
    {
        if(num<0)
        {
            num=num*-1;
        }
//
//        if(num=0){
//            return ;
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }

        return count;
    }
}

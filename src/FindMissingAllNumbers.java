//import java.util.ArrayList;
////https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
//class FindMissingAllNumbers {
//    public static void main(String[] args) {
//        //uses in test cases
//        //we can modify later
//    }
//    public List<Integer> findDisappearedNumbers(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//            int check = arr[i] - 1;
//            if (arr[check] != arr[i]) {
//                swap(arr, i, check);
//            } else {
//                i++;
//            }
//        }
//
//        List<Integer> ans = new ArrayList<>();
//        for (int index = 0; index < arr.length; index++) {
//            if (arr[index] != index + 1) {
//                ans.add(index + 1);
//            }
//        }
//
//        return ans;
//    }
//        void swap ( int[] arr, int first, int second )
//        {
//            int temp;
//            temp = arr[first];
//            arr[first] = arr[second];
//            arr[second] = temp;
//        }
//}
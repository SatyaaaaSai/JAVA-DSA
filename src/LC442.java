import java.util.ArrayList;

//public class LC442 {

//    //https://leetcode.com/problems/find-all-duplicates-in-an-array/
//    public class FindAllMissingNumbers {
//        public List<Integer> findDuplicates(int[] arr) {
//            int i = 0;
//            while (i < arr.length) {
//                int check = arr[i] - 1;
//                if (arr[check] != arr[i]) {
//                    swap(arr, i, check);
//                } else {
//                    i++;
//                }
//            }
//
//            List<Integer> ans = new ArrayList<>();
//            for (int index = 0; index < arr.length; index++) {
//                if (arr[index] != index + 1) {
//                    ans.add(arr[index]);
//                }
//            }
//            return ans;
//        }
//        void swap ( int[] arr, int first, int second )
//        {
//            int temp;
//            temp = arr[first];
//            arr[first] = arr[second];
//            arr[second] = temp;
//        }
//
//    }
//}

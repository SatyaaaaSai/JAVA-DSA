package Recursion;

import java.util.ArrayList;

public class LinearSearchRecurrWithMultipleOccurences {
    public static void main(String[] args) {
        LinearSearchRecurrWithMultipleOccurences obj=new LinearSearchRecurrWithMultipleOccurences();
        int[] arr = {1, 2, 3, 4, 4, 5, 6};
           obj.findInIndex(arr, 4, 0);
        System.out.println(obj.list);
        }

        ArrayList<Integer> list = new ArrayList<>();
        public void findInIndex ( int[] arr, int target, int index){
            if (index == arr.length) {
                return;
            }


            if (arr[index] == target) {
                list.add(index);
            }

            findInIndex(arr, target, index + 1);
        }
    }

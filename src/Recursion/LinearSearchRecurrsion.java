package Recursion;

public class LinearSearchRecurrsion {
    public static void main(String[] args) {
        LinearSearchRecurrsion obj = new LinearSearchRecurrsion();
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(obj.find(arr, 4, 0));
        System.out.println(obj.findInIndex(arr, 4, 0));
        System.out.println(obj.findFromBack(arr, 4, arr.length - 1));

    }

    public boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

    public int findInIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }


        if (arr[index] == target) {
            return index;
        }

        return findInIndex(arr, target, index + 1);
    }

    public int findFromBack(int[] arr, int target, int index) {
//        if (index == -1) {
//            return -1;
//        }
//
//        if (arr[index] == target) {
//            return index;
//        } else {
//            return findInIndex(arr, target, index - 1);
//        }
//    }
            if (index == -1) {
                return -1;
            }
            if (arr[index] == target) {
                return index;
            } else {
                return findFromBack(arr, target, index - 1);
            }
        }
    }

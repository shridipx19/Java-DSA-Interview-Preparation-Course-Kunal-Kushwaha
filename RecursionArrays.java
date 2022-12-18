import java.util.ArrayList;

public class RecursionArrays {
    // check if an array is sorted in ascending order

    static boolean isSort( int[] arr, int i) {
        if (i == arr.length -1)
            return true;

//        // this could be also wrote as && logical statements and directly given true or false to function
//        if (arr[i] <= arr[i+1])
//            return isSort(arr, i+1);
//        else
//            return false;
        return arr[i] <= arr[i+1] && isSort(arr, i+1);

    }

    // linear search using recursion

    static ArrayList<Integer> list = new ArrayList<>();

    static ArrayList<Integer> linearSearch(int[] arr, int target, int index ){
        if (index ==  arr.length) {
            return list;
        }

        if (arr[index] == target) list.add(index);
        return linearSearch(arr, target, index +1);
    }
    static boolean linearSearch2(int[] arr, int target, int index) {
        if (index == -1) return false;
        return arr[index] == target || linearSearch2(arr, target, index -1); // remember to pass valid index value in actual parameters
    }
// if your function in boolean type you can merge statements by logical && || to save time and to validate the return statement in a more logical manner

    // linearSearch with a use of list
    static ArrayList<Integer> linearSearch4(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return linearSearch4(arr, target, index+1, list);
    }

    // binary search in a rotated array

    static int binarySearchInRotatedArray( int[] arr, int target, int s, int e) {
        if (s > e) return -1;
        int m = s + (e - s)/2;
        if (arr[m] == target) return m;
        // check if the first half is sorted in the array
        if (arr[s] <= arr[m]){
            if (target >= arr[s] && target <= arr[m]){
                // then the key lies in the first half
                return binarySearchInRotatedArray(arr, target, s, m-1);
            }
                // else it lies in the second half
            else return binarySearchInRotatedArray(arr, target, m+1, e);
        }
        if (target >= arr[m] && target <= arr[e]){
            return binarySearchInRotatedArray(arr, target, m+1, e);
        }
        return binarySearchInRotatedArray(arr, target, s, e-1);
    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {8,9,5,6,7};
            System.out.println(binarySearchInRotatedArray(arr, 5, 0,arr.length -1 ));

    }
}

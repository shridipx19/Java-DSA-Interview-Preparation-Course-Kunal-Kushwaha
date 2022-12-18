import java.util.Arrays;

public class SortingUsingRecursion {
    //bubble sort using function

    static int[] bubbleSort(int[] arr) {

        for (int i = 0; i< arr.length; i++) {
            boolean check = false;
            for (int j = 1; j< arr.length -i; j++) {

                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                check = true;
                }
            }
            if(!check) return arr;
        }
        return arr;
    }
    // now bubble sort using recursion
    static int[] bubbleSortUsingRecursion(int[] arr, int index, int lastIndex){
        if (lastIndex == 0) return arr;
        if (index < lastIndex) {
            if (arr[index] > arr[index + 1]) {
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
            return bubbleSortUsingRecursion(arr, index + 1, lastIndex);
        }else
        return bubbleSortUsingRecursion(arr, 0, lastIndex -1);
    }
    // selection sort using iteration
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i< arr.length; i++) {
             int lastIndex = arr.length -1 - i;
             int maxIndex = maxElementIndex(arr,lastIndex);
             int temp = arr[lastIndex];
             arr[lastIndex] = arr[maxIndex];
             arr[maxIndex] = temp;
        }
        return arr;
    }

    static int maxElementIndex(int[] arr, int lastIndex){
        int max = 0;
        for (int i = 0; i <= lastIndex; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max ;
    }


    // main
    public static void main(String[] args) {
        int[] arr = {1,2,35,4,5,65,55,78,47};
        //System.out.println(Arrays.toString(bubbleSortUsingRecursion(arr, 0, arr.length-1)));
        int[] sortedArray = selectionSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }
}

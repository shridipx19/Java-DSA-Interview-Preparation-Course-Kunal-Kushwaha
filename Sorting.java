import java.util.Arrays;
public class Sorting {

    public static void main(String[] args) {
        int[] arr = {1,3,6,7,4,2,5};
        cyclicSort(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {     // only works when number is from 1 to N
        int i =0;
        while (i < arr.length){
            int correct = arr[i] -1;
            if (arr[i]!= arr[correct] ) {  //if the current value is not equal to the actual value we swap
                swap(arr, i, correct);
            }
            else
                i++;


        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j>0 ; j--){  // since we are moving in the left direction of the array so j-- and j> 0
                if (arr[j-1] > arr[j]){
                    swap(arr, j, j-1);
                }
                else
                    break;

            }
        }

    }
    static void selectionSort(int[] arr) {
        for (int i = 0; i< arr.length; i++) {

            // find the max element in the remaining array and swap with correct index
            int last = arr.length -1-i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start ; i <= end ; i++){
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }


    static void bubbleSort (int[] arr) {
        boolean swap = false; // will check if any swaps are made or not in 1st iteration
        // no new array is being created, in place sorting algorithm
        for (int i = 0; i < arr.length -1; i++) {

            // for every largest element moving to the last-i position of the array
            for (int j = 0; j <arr.length -1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }

                }
            if(!swap){  // checks if no swap is done
                System.out.println("The entered array is already sorted!");
                break;
            }
        }


    }
}

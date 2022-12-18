import java.util.Arrays;

public class QuickSortUsingRecursion {
    static void quickSort(int[] arr, int lo, int hi){
        //base condition
        if (lo >= hi)
            return;
        int start = lo;
        int end = hi;
        int mid = start + (end - start)/ 2;
        int pivot = arr[mid];

        while (start <= end) {
            // while arrray is sorted it wont swap
            while ( arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            // now my pivot is in exact position now just please sort two halves now
            quickSort(arr, lo, end);
            quickSort(arr, start, hi);
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,46,16,34,752,1};
        quickSort(nums,0, nums.length -1);
        System.out.println(Arrays.toString(nums));
    }
}

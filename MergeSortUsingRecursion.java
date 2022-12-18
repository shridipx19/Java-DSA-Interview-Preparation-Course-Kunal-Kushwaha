import java.util.Arrays;

public class MergeSortUsingRecursion {
    static int[] mergeSort(int[] arr) {
        // base condition
        if ( arr.length == 1 ) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr, 0, mid); //mid is exclusive here
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second) {

        int[] res = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] > second[j]){
                res[k] = second[j];
                j++;
            }
            else {
                res[k] = first[i];
                i++;
            }
            k++; // to move ahead
        }
        // it may be possible that there exist some elements in any array, in that case just copy the resmaining elements

        while (i < first.length) {
            res[k] = first[i];
            i++;
            k++;
        }
        while (j< second.length) {
            res[k] = second[j];
            j++;
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));

    }



}

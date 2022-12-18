import java.util.Scanner;

public class OrderedAgnosticBinarySearch {
    static int orderedAgnosticBS(int arr[], int target) {
        int start  = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start]<arr[end] ;   // checks whether the array is sorted in asc or desc order

            while(start <= end) {
                int mid = start + (end - start) / 2;    // in case the sum of start and end exceeds the integer for large inputs

                if(target == arr[mid])
                    return mid;
                if(isAsc) {     // if array is sorted in asc order perform this
                        if(target > arr[mid])
                            start = mid +1;
                        else
                            end = end -1;
                    }
                    else {      // if array is sorted in desc order perform this
                        if(target < arr[mid])
                            start = mid +1;
                        else
                            end = mid -1;
                    }
                }
            return -1;  // if element does not exist in the array
    }

    public static void main(String[] args) {    // driver code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();     // input the size of the array
        int[] arr = new int[size];
        System.out.println("Enter elements in the array");
            for (int i = 0; i< arr.length; i++) {    // input array elements
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter target element");
        int target = sc.nextInt();      // input the target element
        int index = orderedAgnosticBS(arr, target);     // returns the position of the element in the array, -1 in case element does not exist

        if (index == -1)
            System.out.println("Element not found :(");
        else
            System.out.println("Element found at index: " + index);

    }
}

public class Ceiling {

    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
            while(start <= end) { // after the while loop breaks then END TARGET START
                int mid = start + (end-start) / 2;
                if (arr[mid] == target)
                    return target;
                else if(target > arr[mid])
                    start = mid +1;
                else
                    end = end -1;
            }
            return arr[start]; // it will give the smallest element greater than target i.e. ceiling
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 22, 34, 43, 56, 64, 67};

        int ans = Ceiling(arr, 37);
        System.out.println(ans);
    }
}

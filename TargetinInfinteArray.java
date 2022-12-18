public class TargetinInfinteArray {

    public static void main(String[] args) {
        int[] nums = { 1,3,5,6,7,8,11,13,15,17,20,21,22,25,26,36,37,64,75};
        int target = 15;
        int index  = element(nums, target);
        System.out.println(index);
    }
    public static int element(int[] nums, int target) {

        int start = 0;
        int end = 1;
            while(target>nums[end]) {

                      // start will be end + size of the box * 2 i.e. size of the box is end - start + 1
                int temp = end -1;
                end = end + (end - start + 1); //using start so that doesnt interfare with the existing start and end values
                start = end + 1;
                start = temp;
            }

            return binarySearch(nums, target, start, end);


    }

    static int binarySearch (int[] nums, int target, int start, int end) {
        int mid;
            while (start <= end ) {
                mid = start + (end - start) / 2;
                if ( target == nums[mid]) {
                    return mid;
                }
                else if (target > nums[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            return -1;
    }
}

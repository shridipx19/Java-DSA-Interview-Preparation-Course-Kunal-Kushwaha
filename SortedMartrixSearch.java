import java.util.Arrays;

public class SortedMartrixSearch {

        public static void main(String[] args) {
            int[][] matrix = {
                            {1,2},
                            {5,6},
                            {9,10},
                            {13,14}};
            System.out.println(Arrays.toString(binarySearch(matrix, 14)));
        }
    static int[] binarySearch(int[][] matrix, int target) {
        int row = 0;
        int col =  3;

            while(row< matrix.length && col >= 0){
                if (matrix[row][col] == target)
                    return new int[] {row,col};
                else if (target < matrix[row][col])
                    col--;
                else
                    row--;
            }
            return new int[] {-1,-1};
    }
}

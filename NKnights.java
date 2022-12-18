import java.sql.SQLOutput;

public class NKnights {
    public static void main(String[] args) {
    int n = 4;
    boolean[][] board = new boolean[n][n];
    knight(board, 0, 0, 4);
    }
    private static void knight(boolean[][] board, int row, int col, int target) {
        int count = 1;
        if (target == 0) {
            display(board, count++);
            System.out.println();
            return;
        }
        if (col == board.length) {
            knight(board, row + 1, 0, target); // Jump to the next row if reached the end of the column
            return;
        }
        if (row == board.length -1 && col == board.length -1)
            return;
        if(isSafe(board, row, col)) {
            board[row][col] = true;     // Mark while entering the cell
            knight(board, row, col +1, target -1 ); //  knight placed +1
            board[row][col] = false;    // Mark while exiting the cell
        }
        // If not placed knights simply call the function again
        knight(board, row, col +1, target);

    }
    private static void display(boolean[][] board,int count){
        System.out.println(count);
        for (boolean[] row : board) {
            for (boolean element : row) {
                if(element) {
                    System.out.print("K ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    private static boolean isSafe(boolean[][] board, int row, int col){
        if (isValid(board, row -1, col +2)) {
            if (board[row -1][col +2])  // If knight already exists at UP RIGHT RIGHT
                return false;
        }
        if (isValid(board, row -1, col -2)) {
            if (board[row -1][col -2])  // If knight already exists at UP LEFT LEFT
                return false;
        }
        if (isValid(board, row -2, col +1)) {
            if (board[row -2][col +1])  // If knight already exists at UP UP RIGHT
                return false;
        }if (isValid(board, row -2, col -1)) {
            if (board[row -2][col -1])  // If knight already exists at UP UP LEFT
                return false;
        }
        return true;    // You can place it's safe


    }
    private static boolean isValid(boolean[][] board, int row, int col) {
       if(row >= 0 && row < board.length && col >= 0 && col < board.length) {
           return true;
       }
       return false;
    }
}

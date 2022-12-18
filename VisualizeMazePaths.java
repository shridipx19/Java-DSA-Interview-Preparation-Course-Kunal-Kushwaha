import java.util.Arrays;

public class VisualizeMazePaths {
    public static void main(String[] args) {
        // Consider an array of size 3 X 3
        boolean[][] board = {
                            {true, true, true},
                            {true, true, true},
                            {true, true, true}
                            };
        int[][] path = new int[board.length][board[0].length];
        allPaths(board, "",0, 0, path, 1);
    }
    static void allPaths (boolean[][] maze, String p, int row, int col, int[][] path, int step) {
        if (row == maze.length -1 && col == maze[0].length -1) {
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));    // Path as per the matrix
            }
            System.out.println(p);  // Letter wise path
            System.out.println();
            return;
        }
        if(!maze[row][col]) // Obstacle
            return;
        maze[row][col] = false;     // Mark while entering the cell
        path[row][col] = step;      // Mark corresponding step

        if (row < maze.length -1) {
            // Moving "DOWN" in the maze
            allPaths(maze, p + 'D', row +1, col, path, step +1);
        }
        if (col < maze[0].length -1) {
            // Moving "RIGHT" in the maze
            allPaths(maze, p + 'R', row, col +1, path, step +1);
        }
        if (row > 0) {
            // Moving "UP" in the maze
            allPaths(maze, p + 'U', row -1, col, path, step +1);
        }
        if (col > 0) {
            // Moving "LEFT" in the maze
            allPaths(maze, p + 'L', row, col -1, path, step +1);
        }
        path[row][col] = 0;     // Reset current cell
        maze[row][col] = true;  // Remark while leaving the cell
    }
}

public class MazeAllPaths {
    public static void main(String[] args) {
     boolean[][] matrix = { {true, true, true},
                            {true, true, true},
                            {true, true, true}
                          };
     allPaths("", matrix, 0,0);
    }
    static void allPaths(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length -1 && col == maze[0].length -1) {
            System.out.println(p);
            return;
        }
        if (!maze[row][col]) // obstacle
            return;
        maze[row][col] = false; // mark while entering the cell
        if (row < maze.length -1) {
            allPaths(p + 'D', maze, row + 1, col);
        }
        if (col < maze[0].length -1) {
            allPaths(p + 'R', maze, row, col + 1);
        }
        if (row > 0) {
            allPaths(p + 'U', maze, row - 1, col);
        }
        if (col > 0) {
            allPaths(p + 'L', maze, row, col - 1);
        }
        maze[row][col] = true; // mark while exiting the column
    }

}

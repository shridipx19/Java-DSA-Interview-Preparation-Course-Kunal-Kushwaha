import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        int res = count(3,3);
//        System.out.println(res);
//        path("", 3,3);
//        System.out.println( allPaths("", 3, 3));
        boolean[][] board = {{true,true,true},
                            {true,true,true},
                            {true,true,true},
                            };
        allDirections("", board, 0, 0);
    }
    static int count (int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int right = count(row - 1, col);
        int left = count(row, col - 1);

        return right + left;
    }
    static void path(String p, int row, int col){
        if (row == 1 && col == 1) {
            System.out.println(p);
        }
        if (row > 1) {
            path(p + 'D',row -1, col);
        }
        if (col > 1) {
            path(p + 'R', row, col - 1);
        }

    }
    static ArrayList allPaths(String p, int row, int col) {

        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1)
            list.addAll(allPaths(p + 'V',row - 1, col));
        if (col > 1)
            list.addAll(allPaths(p+'H', row, col -1));
        if(row>1 && col >1)
            list.addAll(allPaths(p+'D',row -1, col -1));
        return list;
    }
    static void restriction(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length -1 && col == maze[0].length -1) {
            System.out.println(p);
        }

        if(!maze[row][col]) // to check for the obstacle
            return;
        if(row < maze.length -1) {
            restriction(p+ 'R', maze , row +1, col);
        }
        if (col < maze[0].length -1) {
            restriction(p+ 'D', maze, row, col + 1);
        }

    }
    static void allDirections (String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length) {
            System.out.println(p);
            return;
        }
        // for obstacle
        if (!maze[row][col])
            return;
        maze[row][col] = false; // marking as visited
        if (row < maze.length -1)
            allDirections(p + 'D', maze, row +1, col);
        if (col < maze[0].length -1)
            allDirections(p + 'R', maze, row, col +1);
        if (col > 0)
            allDirections(p + 'L', maze, row, col - 1);
        if (row > 0)
            allDirections(p + 'U', maze, row -1, col);
        // this line will be where the function call will be over
        // just remark the leaving cell as true;
        maze[row][col] = true;
    }
 }

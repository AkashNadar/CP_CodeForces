import java.util.LinkedList;
import java.util.Queue;

public class Island {
    public int numIslands(char[][] grid) {
        // Code here
        int m = grid.length();
        int n = grid[0].length();
        
        int[][] vis = new int[m][n];
        
        for(int row = 0; row < m; row++) {
            for(int col = 0; col < n; col++) {
                if (grid[row][col] == '1' && vis[row][col] == 0) {
                    bfs
                }
            }
        }
    }

    public void bfs(int row, int col, int[][] vis, char[][] grid) {
        vis[row][col] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(row, col));
        int gRow = grid.length();
        int gCol = grid[0].length();

        while (!q.isEmpty()) {
            int ro = q.peek().first;
            int co = q.peek().second;

            for (int nrow = -1; nrow <= 1; nrow++) {
                for (int ncol = -1; ncol <= 1; ncol++) {
                    int r = ro + nrow;
                    int c = co + ncol;
                    if (r >= 0 && r < row && c >= 0 && c < col
                            && vis[r][c] == 0 && grid[r][c] == '1') {
                        bfs(r, c, vis, grid);
                    }
                }
            }
        }

    }}

Class Pair{
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

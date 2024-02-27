package day0222;

public class MazeRecursive {
    private int[][] maze;
    private int n;
    private int m;

    public MazeRecursive(int n, int m) {
        this.n = n;
        this.m = m;
        maze = new int[n][m];
    }

    public void generateRandomMaze() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = Math.random() < 0.5 ? 0 : 1;
            }
        }
    }

    public boolean solveMaze(int x, int y) {
        if (x < 0 || x >= n || y < 0 || y >= m || maze[x][y] != 0) {
            return false; // 범위를 벗어나거나 이동할 수 없는 칸인 경우
        }

        maze[x][y] = 2; // 이동 가능한 칸을 2로 표시

        if (x == n - 1 && y == m - 1) {
            return true; // 출구 도착
        }

        // 상하좌우 이동
        if (solveMaze(x - 1, y)) {
            return true;
        }
        if (solveMaze(x + 1, y)) {
            return true;
        }
        if (solveMaze(x, y - 1)) {
            return true;
        }
        if (solveMaze(x, y + 1)) {
            return true;
        }

        return false;
    }

    public void printMaze() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8;
        int m = 8;

        MazeRecursive mazeRecursive = new MazeRecursive(n, m);
        mazeRecursive.generateRandomMaze();

        System.out.println("미로 생성:");
        mazeRecursive.printMaze();

        mazeRecursive.solveMaze(0, 0);

        System.out.println("미로 탐색 후:");
        mazeRecursive.printMaze();
    }
}


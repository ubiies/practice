package day0220;

/**
 * 0이면 갈 수 없는 길, 1이면 갈 수 있는 길로 
 * 시작점에서 끝점까지 찾아가는 클래스
 * @author 김은비
 * @version 1.0
 * @since 2024-02-21
 */
public class Maze {
    static int[][] board = {
        {1,0,0,0,0},
        {1,1,0,1,1},
        {0,1,1,1,1},
        {1,0,1,1,0},
        {1,0,0,1,1}};
    static int[][] visited = new int[5][5];
    static int cnt = 0;
    static int n,m;
    public static void main(String[] args) {
        dfs(0,0,cnt);
        System.out.println("도달 가능한 경로의 개수 : "+cnt);
    }
    
    public static void dfs(int x, int y, int count) {
        if (x==4 && y==4) {
            cnt++;
            return;
        }
        visited[x][y] = 1;

        // 상하좌우로 이동하며 갈 수 있는 경로를 찾음
        if (x - 1 >= 0 && board[x - 1][y] == 1 && visited[x - 1][y] == 0) {
            dfs(x - 1, y, cnt);
        }
        if (x + 1 < 5 && board[x + 1][y] == 1 && visited[x + 1][y] == 0) {
            dfs(x + 1, y, cnt);
        }
        if (y - 1 >= 0 && board[x][y - 1] == 1 && visited[x][y - 1] == 0) {
            dfs(x, y - 1, cnt);
        }
        if (y + 1 < 5 && board[x][y + 1] == 1 && visited[x][y + 1] == 0) {
            dfs(x, y + 1, cnt);
        }

        visited[x][y] = 0;
    }
}
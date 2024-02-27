package day0221;
import java.util.Scanner;
import java.util.Random;

/**
 * TicTacToe Game
 * @author 김은비
 * @version 1.0
 * @since 2024-02-22
 */
public class TicTacToe {
    static char[][] board = new char[3][3];
    static int x, y;
    static Scanner sc = new Scanner(System.in);

    /*
     * 보드 초기화 메서드
     */
    static void start(char[][] board) {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                board[i][j] = ' ';
            }
        }
    }
    
    /*
     * 보드 그리기 메서드
     */
    static void draw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println("  " + board[i][0] + "|  "
                    + board[i][1] + "|  " + board[i][2]); 
            if (i != 2) 
                System.out.println("---|---|---");			
        }
        System.out.println("-----------");
    }

    /*
     * 플레이어 입력 메서드
     */
    static void player() {
        System.out.print("어디에 둘건가요? (1,2,3만 가능) : ");
        int xInput = sc.nextInt() - 1; // 0부터 2로 변환
        int yInput = sc.nextInt() - 1; // 0부터 2로 변환
        if (isValidMove(xInput, yInput)) {
            board[xInput][yInput] = 'X';
        } else {
            System.out.println("유효하지 않은 위치입니다. 다시 입력해주세요.");
            player(); // 재귀 호출
        }
    }

    /*
     * 컴퓨터
     */
    static void computer() {
        Random rand = new Random();
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!isValidMove(x, y));
        board[x][y] = 'O';
    }

    /*
     * 유효한 위치인지 확인하는 메서드
     */
    static boolean isValidMove(int x, int y) {
        return (x >= 0 && x < 3 && y >= 0 && y < 3 && board[x][y] == ' ');
    }

    /*
     * 승자 판별 메서드
     */
    static boolean winner(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true; // 가로 방향
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true; // 세로 방향
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; // 왼쪽 대각선
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true; // 오른쪽 대각선 
        }
        return false; // 승리 조건을 만족하지 않는 경우
    }
    

    public static void main(String[] args) {
        start(board);
        draw(board);
        
        while (true) {
            player(); 
            draw(board); 
            if (winner(board, 'X')) {
                System.out.println("플레이어가 승리했습니다!");
                break;
            }
            computer(); 
            draw(board); 
            if (winner(board, 'O')) {
                System.out.println("컴퓨터가 승리했습니다!");
                break;
            }
        }

        sc.close(); 
    }
}

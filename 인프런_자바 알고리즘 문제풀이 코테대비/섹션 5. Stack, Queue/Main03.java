/* 5.3. 크레인 인형뽑기(카카오) */
import java.util.*;

public class Main03 {
    public int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        // moves : x축
        for (int i = 0; i < m; i++) {
            int pos = moves[i] - 1;
            for (int j = 0; j < n; j++) { // y축 돌면서 인형 찾기
                // board에서 0이 아니면 인형
                if (board[j][pos] != 0) {
                    // stack이 비어있지 않고 stack의 가장 최근 값과 현재 값이 같은 안형이면 삭제
                    if (!stack.isEmpty() && stack.peek() == board[j][pos]) {
                        stack.pop();
                        answer += 2; // 2개 삭제
                    } else {
                        // stack에 넣기
                        stack.push(board[j][pos]);
                    }
                    // 찾으면 0 으로 변경하고 break
                    board[j][pos] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main03 T = new Main03();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, board, m, moves));
    }
}
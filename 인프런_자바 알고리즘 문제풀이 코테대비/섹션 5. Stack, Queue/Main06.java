/* 5.6. 공주구하기 */
import java.util.*;

public class Main06 {
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++)
                queue.offer(queue.poll());
            queue.poll();
            if (queue.size() == 1)
                answer = queue.poll();
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main06 T = new Main06();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();

        System.out.println(T.solution(n, k));
    }
}
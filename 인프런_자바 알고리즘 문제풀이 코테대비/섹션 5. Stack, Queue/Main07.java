/* 5.7. 교육과정 설계 */
import java.util.*;

public class Main07 {
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        // queue에 필수 과목 세팅
        for (char x : need.toCharArray())
            queue.offer(x);

        // 필수 과목 순서를 어긴 경우만 확인하면 된다.
        for (char x : plan.toCharArray()) {
            if (queue.contains(x)) { // 계획한 과목이 필수 과목이라면
                if (queue.poll() != x) // queue의 맨 앞에 자료가 아니면
                    return "NO"; // 순서를 어긴 것
            }
        }

        // 필수 과목을 신청 안한 경우
        if (!queue.isEmpty())
            return "NO";

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main07 T = new Main07();
        Scanner kb = new Scanner(System.in);

        String a = kb.next();
        String b = kb.next();

        System.out.println(T.solution(a, b));
    }
}
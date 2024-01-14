/* 5.5. 쇠막대기 */
import java.util.*;

public class Main05 {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();

        // for문으로 str 하나씩
        // ( 면 stack.push()
        // ) 면 stack.peek()로 앞에 ( 괄호였는지 확인
        // ( 괄호면 stack.pop() 하고 stack.size() 만큼 answer 더하기
        // ) 괄호면 str의 i-1 값과 비교해서 ) 면 + 1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(')
                stack.push(arr[i]);
            else {
                stack.pop();
                if (arr[i - 1] == '(') {
                    answer += stack.size();
                } else {
                    answer += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
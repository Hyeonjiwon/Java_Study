/* 5.1. 올바른 괄호 */
import java.util.*;

public class Main01 {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        
        for(char c : str.toCharArray()) {
            if(c == '(') stack.push(c);
            else {
                if(stack.isEmpty()) return "NO"; // 닫는 괄호가 더 많을 경우
                stack.pop(); // 상단의 문자를 꺼냄
            }
        }
        
        // 여는 괄호가 더 많을 경우
        if(!stack.isEmpty()) return "NO";

        return answer; 
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
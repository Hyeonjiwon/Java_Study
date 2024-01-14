/* 5.2. 괄호문자제거 */
import java.util.*;

public class Main02 {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x != ')')
                stack.push(x);
            else {
                while (stack.pop() != '(')
                    ;
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i));
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
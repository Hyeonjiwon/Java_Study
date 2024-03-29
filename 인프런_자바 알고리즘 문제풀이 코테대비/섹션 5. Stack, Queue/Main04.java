/* 5.4. 후위식연산 */
import java.util.*;

public class Main04 {
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        // 0 : 48 ~ 9 : 57
        for (char x : str.toCharArray()) {
            // if ((int) x >= 48 && (int) x <= 57)
            if (Character.isDigit(x)) // 숫자인지 확인하는 메소드
                stack.push(Character.getNumericValue(x)); // x - 48
            else {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                switch (x) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;

                    case '*':
                        result = a * b;
                        break;

                    case '/':
                        result = a / b;
                        break;

                    default:
                        break;
                }
                stack.push(result);
            }
        }
        answer = stack.pop();
        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main04 T = new Main04();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
/* 5.8. 응급실 */
import java.util.*;

class Person {
    int id;
    int priority;

    public Person(int id, int prioirty) {
        this.id = id;
        this.priority = prioirty;
    }
}

public class Main08 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();

        // 순서와 위험도를 저장한 person 객체 생성하여 queue에 삽입
        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Person tmp = queue.poll(); // 현재 환자가 진료를 받을 수 있을지 보기 위해 큐에서 꺼냄
            for (Person x : queue) { // 큐에 있는 모든 대기 목록을 확인해보기
                if (x.priority > tmp.priority) { // 대기 목록 환자의 위험도가 현재 환자의 위험도 보다 높으면
                    queue.offer(tmp); // 뒤에 현재 환자 넣기
                    // 더 비교할 필요가 없음
                    tmp = null;
                    break;
                }
            }

            // 현재 환자가 진료를 받을 수 있는지 없는지 판별
            // tmp가 null이 아닌 것은 현재 우선순위가 더 높은 환자가 없다는 것
            if (tmp != null) {
                answer++;
                if (tmp.id == m)
                    return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, m, arr));
    }
}
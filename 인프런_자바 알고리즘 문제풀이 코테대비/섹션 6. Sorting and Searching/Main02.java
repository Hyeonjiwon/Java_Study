/* 6.2. 버블정렬 */
import java.util.*;

public class Main02 {
    public int[] solution(int n, int[] arr) {
        
        // 이웃한 것끼리 비교
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) { // i가 하나씩 커짐에따라 1씩 감소
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) throws Exception {
        Main02 T = new Main02();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }

        for(int a : T.solution(n, arr))
            System.out.print(a + " ");
    }
}
/* 6.3. 삽입정렬 */
import java.util.*;

public class Main03 {
    public int[] solution(int n, int[] arr) {

        for(int i=1; i<n; i++) {
            int tmp = arr[i], j;

            for(j=i-1; j>=0; j--) {
                if(arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }

            arr[j+1] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) throws Exception {
        Main03 T = new Main03();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }

        for(int x : T.solution(n, arr))
            System.out.print(x + " ");
    }
}

/*
선택 정렬(selection sort)은 제자리 정렬 알고리즘의 하나이다. 
1. 주어진 리스트 중에 최소 값을 찾는다. 
2. 그 값을 맨 앞에 위치한 값과 교체한다.
3. 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다. 

비교하는 것이 상수 시간에 이루어진다는 가정 아래, 
n개의 주어진 리스트를 이와 같은 방법으로 정렬하는 데에는 O(n^2)만큼의 시간이 걸린다.

선택 정렬은 알고리즘이 단순하며 
사용할 수 있는 메모리가 제한적인 경우에 사용시 
성능 상의 이점이 있다. 

a[i] 부터 a[n-1] 까지 차례로 비교하여 가장 작은 값이 a[j]있으면 
a[i]와 a[j]의 값을 바꾼다. 


버블 정렬(bubble sort)은 정렬 알고리즘 중 하나이다. 
시간 복잡도가 O(n^2)으로 상당히 느리지만, 
코드가 단순하기 때문에 자주 사용된댜. 
원소의 이동이 거품이 수면으로 올라오는 듯한 모습을 보이기 때문에 지어진 이름이다. 

버블 정렬은 기본적으로 배열의 두 수(a, b)를 선택한 뒤, 
만약 그 두 수가 정렬되었다면 놔두고
아니라면 두 수를 바꾸는 방식으로 진행된다.
오름차순으로 정렬할 때는 a < b, 내림차순이라면 a > b 여야 정렬된 것으로 판단한다. 
이를 배열의 끝까지 반복한다.

위 알고리즘을 배열에 아무 변화가 없을 때까지 반복한다. 


삽입 정렬(insertion sort)은 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 
자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘
*/
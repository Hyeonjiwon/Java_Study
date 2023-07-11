import java.util.*;

class App {
    // 종이접기 모르겠음
    /*
    public int solution(int[][] grid) {
        int answer = 0;
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                for(int k = j + 1; k < 4; k += 2) {
                    int a = grid[i][j];
                    int b = grid[i][k];
                    int c = grid[j][i];
                    int d = grid[k][i];
                    answer = Math.max(answer, Math.max(a + b, c + d));
                }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        App sol = new App();
        int[][] grid = {{1, 4, 16, 1}, {20, 5, 15, 8}, {6, 13, 36, 14}, {20, 7, 19, 15}};
        int ret = sol.solution(grid);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
*/

/*
    // 메모장
    // 다음과 같이 import를 사용할 수 있습니다.
    public int solution(int K, String[] words) {
        // 여기에 코드를 작성해주세요.
//         int answer = 1;
        
//         int wordLen = 0;
//         for(int i = 0; i < words.length; i++) { 
//             wordLen += words[i].length() + 1;
            
//             if(wordLen > K+1) {
//                 answer++;
//                 wordLen = words[i].length()+1;
//             }
//         }
        int answer = 1;
        
        int nowLeng = 0;
        for(int i = 0; i < words.length; i++){
            if(nowLeng + words[i].length() > K){
                nowLeng = 0;
                answer++;
            }
            nowLeng += words[i].length()+1;
        }
 
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        App sol = new App();
        int K = 10;
        String[] words = {new String("nice"), new String("happy"), new String("hello"), new String("world"), new String("hi")};
        int ret = sol.solution(K, words);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소의 반환 값은 " + ret + " 입니다.");
    }
    */

    // 숫자 뽑기
    public int solution(int[] arr, int K) {
        // 여기에 코드를 작성해주세요.
        Arrays.sort(arr);
        int answer = arr[arr.length - 1];

        for(int i = 0; i < K; i++) {
            
        }
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        App sol = new App();
        int[] arr = {9, 11, 9, 6, 4, 19};
        int K = 4;
        int ret = sol.solution(arr, K);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
    }
}
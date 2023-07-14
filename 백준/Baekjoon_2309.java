package 백준;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Baekjoon_2309 {
    static ArrayList<int[]> combinationList = new ArrayList<>();
    
    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) { 
            int answer = 0;
            int[] comb = new int[n];

            for(int i=0; i<n; i++) {
                if(visited[i]) {
                    // System.out.print(arr[i] + " ");

                    answer += arr[i];
                    comb[i] = arr[i];
                }
            }
            if(answer == 100) { // 난쟁이 키 합이 100인 경우
                combinationList.add(comb);
            }

            // System.out.println();
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i+1, n, r-1);
            visited[i] = false;
        }
        
    }

    public static void main(String[] args) throws IOException {
        // Scanner 보다 빠름
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arrHeight = new int[9];

        int n = 9, r = 7;
        boolean[] visited = new boolean[n];

        for(int i=0; i<9; i++) {
            String height = bf.readLine();
            arrHeight[i] = Integer.parseInt(height);
        }

        // System.out.println();

        // 7 8 10 13 15 19 20 23 25   여기서 7개만 뽑기 
        // 9C7 조합으로 모든 경우를 구해서 100 이하인 배열들만 list에 담기  
        // 타임아웃 에러가 안날까 ... ?  9 * 8 / 2 * 1 = 36 
        // 백트레킹 
        
        // System.out.println("\n" + n + " 개 중에서 " + r + " 개 뽑기");
        combination(arrHeight, visited, 0, n, r);

        // System.out.println();

        int[] answer = combinationList.get(0);
        Arrays.sort(answer);

        for(int i=0; i<answer.length; i++) {
            if(answer[i] != 0) {
                System.out.println(answer[i]);
            }
        }
        
    }
}

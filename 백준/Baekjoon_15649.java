package 백준;

import java.io.*;

public class Baekjoon_15649 {
    
    static void combination(int[] arr, boolean visited[], int start, int n, int m) {
        if(m == 0) {
            for(int i=0; i<n; i++) {
                if(visited[i]) {
                    System.out.print(arr[i] + " ");

                     /*
                      * 4 2
                        1 2 
                        1 3 
                        1 4 
                        2 3 
                        2 4 
                        3 4 
                      */
                }
            }

            System.out.println();

            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i+1, n, m-1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = i+1;
        }

        boolean[] visited = new boolean[n];

        combination(arr, visited, 0, n, m);
    }
}

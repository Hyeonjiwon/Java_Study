package 백준;

import java.io.*;

public class Baekjoon_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] s = bf.readLine().split("");
        int[] alphabet = new int[26];

        for(int i=0; i<s.length; i++) {
            char c = s[i].charAt(0);
            alphabet[c-'a'] += 1;
        }

        for(int i : alphabet) {
            System.out.print(i + " ");
        }
    }
}

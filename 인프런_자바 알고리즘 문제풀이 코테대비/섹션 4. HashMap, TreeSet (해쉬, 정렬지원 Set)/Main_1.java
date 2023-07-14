import java.util.*;
import java.util.Scanner;

public class Main_1 {
    public char solution(int n, String s) { 
    	char answer = ' ';
		HashMap<Character, Integer>  map = new HashMap<>();

		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1); // getOrDefault : x라는 key가 없으면 0을 return
		}

		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key) > max ) {
				max = map.get(key);
				answer = key;
			}
		}
		
    	return answer;
    }

    public static void main(String[] args) throws Exception {
    	Main_1 T = new Main_1();
    	Scanner kb = new Scanner(System.in);

    	int n = kb.nextInt();
        String str = kb.next(); 
    	
    	System.out.println(T.solution(n, str));
    }
}

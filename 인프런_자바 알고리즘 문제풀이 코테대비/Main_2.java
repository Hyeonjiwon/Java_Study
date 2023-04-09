import java.util.*;
import java.util.Scanner;

public class Main_2 {
    public String solution(String s1, String s2) { 
    	String answer = "";
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for(char x : s1.toCharArray()) {
			map1.put(x, map1.getOrDefault(x, 0));
		}

		for(char x : s2.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0));
		}

		for(char key : map1.keySet()) {
			if(map1.get(key) == map2.get(key) ) {
				answer = "YES";
			}
		}

    	return answer;
    }

    public static void main(String[] args) throws Exception {
    	Main_2 T = new Main_2();
    	Scanner kb = new Scanner(System.in);

        String str1 = kb.next(); 
		String str2 = kb.next(); 
    	
    	System.out.println(T.solution(str1, str2));
    }
}

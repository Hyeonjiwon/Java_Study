


1. 큰 수 출력하기 

**풀이**
```java
import java.util.Scanner;
  
public class Main {
    public String solution(int n, String str) {
    	String answer = "";
    	String[] numArr = str.split(" ");
    	
    	answer += numArr[0] + " ";
    	for(int i=0; i<n-1; i++) {
    		if(Integer.parseInt(numArr[i]) < Integer.parseInt(numArr[i+1])) {
    			answer += numArr[i+1] + " ";
    		}
    	}
    	
    	return answer;
    }

    public static void main(String[] args) throws Exception {
    	Main T = new Main();
    	Scanner kb = new Scanner(System.in);
    	
    	int n = Integer.valueOf(kb.nextLine());
    	String str = kb.nextLine();
    	
    	System.out.println(T.solution(n, str));
    }
}
```

<br>

-- 

<br>

2. 보이는 학생

**풀이**
```java
import java.util.Scanner;
  
public class Main {
    public int solution(int n, String str) {
    	int answer;
    	
    	 String[] heights = str.split(" ");
    	 
    	 int max = Integer.valueOf(heights[0]);
    	 answer = 1;
    	 for(int i=1; i<heights.length; i++) { 
    		 if(max < Integer.valueOf(heights[i])) {
    			 max = Integer.valueOf(heights[i]);
    			 answer++;
    		 }
    	 }
    	
    	return answer;
    }

    public static void main(String[] args) throws Exception {
    	Main T = new Main();
    	Scanner kb = new Scanner(System.in);
    	
    	int n = Integer.valueOf(kb.nextLine());
    	String str = kb.nextLine();
    	
    	System.out.println(T.solution(n, str));
    }
}
```

<br>

--

<br>

3. 가위 바위 보

**풀이**
```java
import java.util.Scanner;
  
public class Main {
    public String solution(int n, String str1, String str2) {
    	String answer = "";
    	
    	String[] A = str1.split(" ");
    	String[] B = str2.split(" ");
    	
    	for(int i=0; i<n; i++) {
    		int a = Integer.valueOf(A[i]);
    		int b = Integer.valueOf(B[i]);
    		
    		// 가위 1 > 보 3
    		// 바위 2 > 가위 1
    		// 보 3 > 바위 2
    		if(a==b) answer += "D";
    		else if(a==1 && b==3 || a==2 && b==1 || a==3 && b==2) answer += "A";
    		else answer += "B";
    	}
    	
    	return answer;
    }

    public static void main(String[] args) throws Exception {
    	Main T = new Main();
    	Scanner kb = new Scanner(System.in);
    	
    	int n = Integer.valueOf(kb.nextLine());
    	String str1 = kb.nextLine();
    	String str2 = kb.nextLine();
    	
    	for(char x : T.solution(n, str1, str2).toCharArray()) {
    		System.out.println(x);
    	}
    }
}
```

<br>

-- 

<br>

4. 피보나치 수열

**풀이**
```java
import java.util.Scanner;
  
public class Main {
    public String solution(int n) {
    	String answer = "";
    	
    	int a = 1;
    	int b = 0;
    	int sum = 0, count = 0;
    	
    	while(count < n) {
    		sum = a+b;
    		answer += sum + " ";
    		a = b;
    		b = sum;
    		
    		count++;
    	}
    	
    	return answer;
    }

    public static void main(String[] args) throws Exception {
    	Main T = new Main();
    	Scanner kb = new Scanner(System.in);
    	
    	int n = Integer.valueOf(kb.nextLine());
    	
    	System.out.println(T.solution(n));

    }
}
```

!! 에라토스테네스 체 공부

<br>
-- 
<br>

5. 소수

**풀이**
```java
import java.util.Scanner;
  
public class Main {
    public int solution(int n) {
    	int answer = 0;
    	
    	// 0, 1은 소수 x
    	if(n < 2) {
    		return answer;
    	}
    	
    	// 2는 소수 
    	if(n == 2) {
    		return answer;
    	}
    	
    	// 그 외
    	int count;
    	for(int i=2; i<n; i++) {
    		count = 0;
    		for(int j=2; j<=Math.sqrt(i); j++) {
    			if(i%j==0) count++;
    		}
    		
    		if(count == 0) answer++; // answer += i + " "; 
    	}
    	
    	return answer;
    }

    public static void main(String[] args) throws Exception {
    	Main T = new Main();
    	Scanner kb = new Scanner(System.in);
    	
    	int n = Integer.valueOf(kb.nextLine());
    	
    	System.out.println(T.solution(n));
    }
}
```

!! 에라토스테네스 체 공부하고 다시 풀어보기

<br>
--
<br>

6. 뒤집은 소수

**풀이**
```java
```



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

<br>
--
<br>

7. 점수계산

**풀이**
```java
public int solution(int n, String s) {
	int answer = 0;
	String[] strNum = s.split(" ");

	int weight = 0;
	for(int i=0; i<strNum.length; i++) {
		int num = Integer.valueOf(strNum[i]);

		if(num == 0) {
			weight = 0;
		} else {
			weight++;
			answer += weight;
		}
	}

	return answer;
}

public static void main(String[] args) throws Exception {
	Main T = new Main();
	Scanner kb = new Scanner(System.in);

	int n = Integer.valueOf(kb.nextLine());
	String s = kb.nextLine();

	System.out.println(T.solution(n, s));
}
```

<br>
--
<br>

8. 등수 구하기
   
**풀이**

```java
import java.util.Scanner;

public class Main {
    public int[] solution(int n, String s) {

        String[] strNum = s.split(" ");
        int[] answer = new int[n];

        for(int i = 0; i < n; i++) {
            answer[i] = 1;
        }

        for(int i = 0; i < n; i++) {
            int num1 = Integer.valueOf(strNum[i]);
            for(int j = 0; j < n; j++) {
                int num2 = Integer.valueOf(strNum[j]);
                if(i!=j && num1 < num2) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = Integer.valueOf(kb.nextLine());
        String s = kb.nextLine();

        for(int i : T.solution(n, s)) {
            System.out.print(i + " ");
        }
    }
}
```

<br>
--
<br>

9. 격자판 최대합
   
**풀이**

```java
import java.util.Scanner;
  
public class Main {
	public int solution(int n, int[][] arr) {
    	int answer = 0;
    	
    	int colMax = 0; 
    	int rowMax = 0;
    	int crossMax = 0;
		int crossTotal1 = 0, crossTotal2 = 0;
		
    	for(int i=0; i<n; i++) {
    		int rowTotal = 0; 
    		int colTotal = 0;
    		for(int j=0; j<n; j++) {
    			rowTotal += arr[i][j];
    			colTotal += arr[j][i];
    		}
    		
    		crossTotal1 += arr[i][i];
    		crossTotal2 += arr[i][n-i-1];
    		
			rowMax = Math.max(rowMax, rowTotal);
			colMax = Math.max(colMax, colTotal);
			crossMax = Math.max(crossTotal1, crossTotal2);
    	}
    	
    	answer = Math.max(Math.max(rowMax, colMax), crossMax);
    	
    	return answer;
    }

    public static void main(String[] args) throws Exception {
    	Main T = new Main();
    	Scanner kb = new Scanner(System.in);
    	
    	int n = kb.nextInt();
    	int[][] arr = new int[n][n];
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    			arr[i][j] = kb.nextInt();
    		}
    	}
    	
    	System.out.println(T.solution(n, arr));
    }
}
```


<br>
--
<br>

10. 봉우리

**풀이**

```java
import java.util.Scanner;
  
public class Main {
	public int solution(int n, int[][] arr) {
    	int answer = 0;
    	int[] dx = {-1, 0, 1, 0};
    	int[] dy = {0, 1, 0, -1};
    	
    	for(int i=1; i<n+1; i++) {
    		for(int j=1; j<n+1; j++) {
    			boolean isPeaks = true; 
    			
    			for(int k=0; k<4; k++) {
    				int nx = i + dx[k];
    				int ny = j + dy[k];
    				
    				int a = arr[i][j];
    				int b = arr[nx][ny];
    				
    				if(a <= b) {
    					isPeaks = false;
    					break;
    				}
    			}
    			
    			if(isPeaks){
    				answer++;
    			}
    		}
    	}
    	
    	return answer;
    }

    public static void main(String[] args) throws Exception {
    	Main T = new Main();
    	Scanner kb = new Scanner(System.in);
    	
    	int n = kb.nextInt();
    	int[][] arr = new int[n+2][n+2];
    	for(int i=1; i<=n; i++) {
    		for(int j=1; j<=n; j++) {
    			arr[i][j] = kb.nextInt();
    		}
    	}
    	
    	System.out.println(T.solution(n, arr));
    }
```


<br>
--
<br>

11. 임시반장 정하기

**풀이**

```java
    public static int solution(int n, int[][] arr) {
        int answer = 0;

        int max = 0;
        for(int i=1; i<n+1; i++) {
            int cnt = 0;
            for(int j=1; j<n+1; j++) {
                for(int k=1; k<=5; k++) {
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }

            if(max < cnt) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n+1][6];

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=5; j++) {
                arr[i][j] = kb.nextInt();
            }
         }

        System.out.println(solution(n, arr));
    }
```

<br>
--
<br>

.

**풀이**

```java

```
<br>
--
<br>

.

**풀이**

```java

```
<br>
--
<br>

.

**풀이**

```java

```


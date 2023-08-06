import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.next().toLowerCase();
    char input2 = in.next().toLowerCase().charAt(0);
    int count = 0;

    for(int i=0; i<input1.length(); i++) {
        if(input2 == input1.charAt(i)) {
            count++;
        }
    }

    System.out.println(count);
    return ;
  }
}
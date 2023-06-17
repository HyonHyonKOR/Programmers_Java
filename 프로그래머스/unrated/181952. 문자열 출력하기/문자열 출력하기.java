import java.util.Scanner;

public class 문자열출력하기 {

	public static void main(String[] args) {
        try(Scanner s1 = new Scanner(System.in))
       {String str = s1.nextLine();
        int a = str.length();
        if(a>=1 && a<=10000000) {
        System.out.println(str);	
        }
      }
	}
 }
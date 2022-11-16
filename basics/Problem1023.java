import java.util.Scanner;

public class Problem1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String P1023 = sc.next();
		String[] floatArr = P1023.split("\\.");
		
		System.out.println(floatArr[0]);	
		System.out.println(floatArr[1]);	
	}
}
import java.util.Scanner;

public class Problem1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String P1020 = sc.next();
		String[] numberArr = P1020.split("-");
		
		System.out.println(numberArr[0] + numberArr[1]);	
	}
}
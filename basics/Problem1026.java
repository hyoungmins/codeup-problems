import java.util.Scanner;

public class Problem1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String P1026 = sc.next();
		String[] timeArr = P1026.split(":");
		
		int hour = Integer.parseInt(timeArr[1]);
		
		if(hour == 00) {
			System.out.println("0");
		} else {
			System.out.println(hour);
		}
	}
}
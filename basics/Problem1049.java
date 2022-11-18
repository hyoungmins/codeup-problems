import java.util.Scanner;

public class Problem1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1049_1 = sc.nextInt();
		int P1049_2 = sc.nextInt();
		
		int compare = P1049_1 > P1049_2 ? 1 : 0;
		
		System.out.println(compare);
	}
}
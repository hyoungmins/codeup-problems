import java.util.Scanner;

public class Problem1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char smallLetter = sc.next().charAt(0);
		char P1076 = 'a';
		
		while(P1076 <= smallLetter) {
			System.out.print(P1076 + " ");
			P1076 += 1;
		}
	}
}
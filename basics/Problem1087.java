import java.util.Scanner;

public class Problem1087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1087 = sc.nextInt();
		int sum = 0;
		int i = 0;
		
		while(true) {
			i++;
			sum += i;
			if(sum >= P1087) {
				System.out.println(sum);
				break;
			}
		}
	}
}
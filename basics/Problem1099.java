import java.util.Scanner;

public class Problem1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] P1099 = new int[10][10];
		int start = 1;
		
		for(int i = 0; i < P1099.length; i++) {
			for(int j = 0; j < P1099.length; j++) {
				P1099[i][j] = sc.nextInt();
			}
		}
		
		loop:
		for(int i =1; i < P1099.length; i++) {
			for(int j = start; j < P1099.length; j++) {
				if(P1099[i][j] == 2) {
					P1099[i][j] = 9;
					break loop;
				}
				if(P1099[i][j] == 0) {
					P1099[i][j] = 9;
					start++;
				} else {
					start--;
					break;
				}
			}
		}
			
		for(int i = 0; i < P1099.length; i++) {
			for(int j = 0; j < P1099.length; j++) {
			System.out.print(P1099[i][j] + " ");
		}
			System.out.println();
		}
	}
}
import java.util.Scanner;

public class Problem1097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] P1097 = new int[19][19];
		
		for(int i = 0; i < P1097.length; i++) {
			for(int j = 0; j < P1097.length; j++) {
				P1097[i][j] = sc.nextInt();
			}
		}
		
		int coordinate = sc.nextInt();
		
		for(int i = 0; i < coordinate; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j = 0; j < P1097.length; j++) {
				if(P1097[x-1][j] == 0) {
					P1097[x-1][j] = 1;
				} else {
					P1097[x-1][j] = 0;
				}
			}
			for(int j = 0; j < P1097.length; j++) {
				if(P1097[j][y-1] == 0) {
					P1097[j][y-1] = 1;
				} else {
					P1097[j][y-1] = 0;
				}
			}
		}
		
		for(int i = 0; i < P1097.length; i++) {
			for(int j = 0; j < P1097.length; j++) {
				System.out.print(P1097[i][j] + " ");
			}
			System.out.println();
		}
	}
}
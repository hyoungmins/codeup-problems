import java.util.Scanner;

public class Problem1096 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int whiteStone = sc.nextInt();
		int[][] P1096 = new int[19][19];
		
		for(int i = 0; i < whiteStone; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			P1096[x-1][y-1] = 1;
		}
		
		for(int i = 0; i < P1096.length; i++) {
			for(int j = 0; j < P1096.length; j++) {
				System.out.print(P1096[i][j] + " ");
			}
			System.out.println();
		}
	}
}
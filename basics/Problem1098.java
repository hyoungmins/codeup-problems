import java.util.Scanner;

public class Problem1098 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int width = sc.nextInt();
		int[][] P1098 = new int[height][width];
		
		int stick = sc.nextInt();
		
		for(int i = 0; i < stick; i++) {
			int length = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j = 0; j < length; j++) {
				if(d == 0) {
					P1098[x-1][y+j-1] = 1;
				} else {
					P1098[x+j-1][y-1] = 1;
				}
			}
		}
		
		for(int i = 0; i < P1098.length; i++) {
			for(int j = 0; j < P1098[i].length; j++) {
				System.out.print(P1098[i][j] + " ");
			}
			System.out.println();
		}
	}
}
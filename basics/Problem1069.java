import java.util.Scanner;

public class Problem1069 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char P1069 = sc.next().charAt(0);
		
		switch(P1069) {
			case 'A' :
				System.out.println("best!!!");
				break;
			case 'B' :
				System.out.println("good!!");
				break;
			case 'C' :
				System.out.println("run!");
				break;
			case 'D' :
				System.out.println("slowly~");
				break;
			default :
				System.out.println("what?");
				break;
		}
	}
}
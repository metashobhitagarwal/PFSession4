package KnightsTour;

import java.util.Scanner;
/*This is the main class containing the main method
 * this serves the purpose of taking inputs from users 
 * and showing the corresponding output
 */
public class MainKnightsTourProblem {

	public static void main(String[] args) {
		KnightsTourProblem kts=new KnightsTourProblem();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Dimension of matrix :");
		int dimension=scan.nextInt();
		
		kts.solveKP(dimension);
		
		scan.close();
	}
}

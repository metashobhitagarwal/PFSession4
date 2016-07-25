package Assgn3;

import java.util.*;

/*This is the main class containing the main method
 * this serves the purpose of taking inputs from users 
 * and showing the corresponding output
 */
public class MainNQueensProblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueensProblem obj = new NQueensProblem();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Dimension of matrix : ");
		int dimension = scan.nextInt();
		if (dimension <= 0) {
			System.out.println("Please Enter Valid Dimension");
			System.exit(1);
		}

		// 2-D Array Board
		int board[][] = new int[dimension][dimension];

		for (int row = 0; row < dimension; row++) {
			for (int col = 0; col < dimension; col++) {
				board[row][col] = 0;
			}
		}

		if (obj.getQueenSolution(board, 0, dimension) == false) {
			System.out.println("Solution Doesn't found");
			System.exit(1);
		}
		scan.close();

		// Printing Solution
		obj.printSolution(board, dimension);
	}
}

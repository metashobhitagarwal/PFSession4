package Assgn2;

import java.util.Scanner;
/*This is the main class containing the main method
 * this serves the purpose of taking inputs from users 
 * and showing the corresponding output
 */
public class MainStringPermutation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter String : ");
		String str= scan.next();
		StringPermutation obj= new StringPermutation();
		obj.getPermutation(str);
		scan.close();
	}

}

package Assgn1;
import java.util.Scanner;

/*/*This is the main class containing the main method
 * this serves the purpose of taking inputs from users 
 * and showing the corresponding output
 */
public class MainTowerOfHanoi {
	
	public static void main(String[] args) {
		TowerOfHanoi toh=new TowerOfHanoi();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of discs : ");
		int discs=sc.nextInt();
		String[] result=new String[(int)((Math.pow(2, discs))-1)];
		
		System.out.println("No of stpes required are : " + result.length);
		String arr[]=toh.solveTOH(discs, "A", "B", "C",result);
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		sc.close();
	}
}

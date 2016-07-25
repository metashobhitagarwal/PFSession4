package Assgn2;

import static org.junit.Assert.*;

import org.junit.Test;
/*This class is implementing test cases
 */
public class StringPermutationTest {

	@Test
	public void testGetPermutation() {
		StringPermutation str= new StringPermutation();
		
		String[] input1 = {"ABC", "ACB", "BAC","BCA","CAB","CBA"};
		String[] stringArray1 = str.getPermutation("ABC").toArray(new String[0]);
		assertArrayEquals(input1, stringArray1 );
		
		String[] input2 = {"AAA"};
		String[] stringArray2 = str.getPermutation("AAA").toArray(new String[0]);
		assertArrayEquals(input2, stringArray2 );
	}

}

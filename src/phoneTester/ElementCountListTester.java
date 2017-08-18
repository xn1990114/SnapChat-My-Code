package phoneTester;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.ElementCountList;

public class ElementCountListTester {

	@Test
	public void test() {
		ElementCountList ecl=new ElementCountList();
		int[][] array={{0, 0, 1, 1,1, 0, 1, 1}};
		ecl.build(array);
		ecl.display();
		array=new int[0][0];
		ecl=new ElementCountList();
		ecl.build(array);
		ecl.display();
		int[][] array1={{0, 0, 1, 1,1, 0, 1, 1},{1, 0, 1, 1,1, 0, 1, 1},{0, 0, 1, 1,1, 0, 1, 1}};
		ecl=new ElementCountList();
		ecl.build(array1);
		ecl.display();
		int[][] array2={{0, 0, 1, 1,1, 0, 1, 1},{},{1,0, 0, 1, 1,1, 0, 1, 1}};
		ecl=new ElementCountList();
		ecl.build(array2);
		ecl.display();
	}

}

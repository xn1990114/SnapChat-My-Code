package phoneTester;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.RandomNumberInRange;

public class RandomNumberInRangeTester {

	@Test
	public void test() {
		RandomNumberInRange tester=new RandomNumberInRange();
		int[][] nums={{0,5},
					  {9,12},
					  {16,20},
					  {27,28},
					  {33,33}};
		int[] count=new int[34];
		for(int i=0;i<10000;i++){
			count[tester.createRandomNumber(nums)]++;
		}
		for(int i=0;i<34;i++){
			System.out.println(i+"\t"+count[i]);
		}
	}

}

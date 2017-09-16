package phone;

import java.util.*;

/*
 * 题目是给一个lottery system和若干互不重叠的interval，求落在interval之间的一个随机数。
 * 比如[5, 10], [20, 36], ... 返回落在区间内的随机数，且他们出现的概率相等。
 */
public class RandomNumberInRange {
	public int createRandomNumber(int[][] intervals){
		Arrays.sort(intervals,new Comparator<int[]>(){
			public int compare(int[] i1,int[] i2){
				return i1[0]-i2[0];
			}
		});
		int total=0;
		int res=0;
		for(int i=0;i<intervals.length;i++){
			int[] curr=intervals[i];
			total=total+(curr[1]-curr[0]+1);
			int random=(int)(Math.random()*total);
			if(random<(curr[1]-curr[0]+1)){
				res=curr[0]+random;
			}
		}
		return res;
	}
}

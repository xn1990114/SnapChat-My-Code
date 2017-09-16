package phoneTester;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

import phone.MeetingRoomArrangement;
import phone.MeetingRoomArrangement.Interval;

public class MeetingRoomArrangementTester {

	@Test
	public void test() {
		MeetingRoomArrangement tester=new MeetingRoomArrangement();
		List<Interval> list=new ArrayList<Interval>();
		Interval i1=tester.new Interval(2,7);
		list.add(i1);
		List<List<Interval>> res1=tester.arrangeMeetingRoom(list);
		tester.display(res1);
		Interval i2=tester.new Interval(1,2);
		list.add(i2);
		List<List<Interval>> res2=tester.arrangeMeetingRoom(list);
		tester.display(res2);
		Interval i3=tester.new Interval(6,13);
		list.add(i3);
		List<List<Interval>> res3=tester.arrangeMeetingRoom(list);
		tester.display(res3);
		Interval i4=tester.new Interval(6,13);
		list.add(i4);
		List<List<Interval>> res4=tester.arrangeMeetingRoom(list);
		tester.display(res4);
	}

}

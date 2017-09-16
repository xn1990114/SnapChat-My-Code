package phone;
import java.util.*;

/*
 * coding : Meeting room 2 变种，返回每个房间的meeting list. 返回是List<List<Interval>>
 */
public class MeetingRoomArrangement {
	public class Interval{
		int start;
		int end;
		public Interval(int start,int end){
			this.start=start;
			this.end=end;
		}
	}
	public class Room implements Comparable<Room>{
		List<Interval> meetings;
		public Room(){
			this.meetings=new ArrayList<Interval>();
		}
		public int getEnd(){
			if(this.meetings.isEmpty()){
				return -1;
			}
			return this.meetings.get(this.meetings.size()-1).end;
		}
		public int compareTo(Room r2){
			return this.getEnd()-r2.getEnd();
		}
	}
	public List<List<Interval>> arrangeMeetingRoom(List<Interval> intervals){
		PriorityQueue<Room> pq=new PriorityQueue<Room>();
		List<List<Interval>> res=new ArrayList<List<Interval>>();
		Collections.sort(intervals,new Comparator<Interval>(){
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start-o2.start;
			}
		});
		for(int i=0;i<intervals.size();i++){
			Interval curr=intervals.get(i);
			if(pq.isEmpty()||curr.start<pq.peek().getEnd()){
				Room r=new Room();
				r.meetings.add(curr);
				pq.offer(r);
			}
			else{
				Room r=pq.poll();
				r.meetings.add(curr);
				pq.offer(r);
			}
		}
		while(!pq.isEmpty()){
			res.add(pq.poll().meetings);
		}
		return res;
	}
	public void display(List<List<Interval>> res){
		for(int i=0;i<res.size();i++){
			List<Interval> list=res.get(i);
			System.out.print("{");
			for(Interval in:list){
				System.out.print("["+in.start+","+in.end+"]");
			}
			System.out.print("}");
		}
		System.out.println();
	}
}

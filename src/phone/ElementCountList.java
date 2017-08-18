package phone;

/*
 * 矩阵元素可能是0或者1，设计一个链表格式的class来表示矩阵，按照连续出现某个元素的次数。
例子：
[0, 0, 1, 1
1, 0, 1, 1]
用2->3->1->2这样的链表来表示。
implement 构造方法即可。
 */
public class ElementCountList {
	class Node{
		int val;
		Node next;
		public Node(int val){
			this.val=val;
		}
	}
	Node head;
	public ElementCountList(){
		this.head=new Node(0);
	}
	public void build(int[][] array){
		Node parent=head;
		int last=0;
		int count=0;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				if(array[i][j]==last){
					count++;
				}
				else{
					last=array[i][j];
					parent.next=new Node(count);
					parent=parent.next;
					count=1;
				}
			}
		}
		if(count>0){
			parent.next=new Node(count);
		}
	}
	public void display(){
		Node curr=head;
		while(curr!=null){
			System.out.print(curr.val+" ");
			curr=curr.next;
		}
		System.out.println();
	}
}

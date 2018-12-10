package List;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {

	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue<Integer>();
		
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		System.out.println(q);
		
		//since 0 added first, that is why 0 removed first.
		int removedel=q.remove();
		System.out.println(removedel);
		System.out.println(q);
		System.out.println(q.peek());//showing first element
		System.out.println(q.size());



		
	}

}

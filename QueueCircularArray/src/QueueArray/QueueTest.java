

/** M Madden, M Schukat, 2005 - 2015: Abstract Stack interface */

package QueueArray;

import javax.swing.JOptionPane;



public class QueueTest {
	public static void main(String[] args) {
		// Changed queue name and set size
		//added in more queueing and dequeueing
		Queue q = new ArrayCircularQueue(9); 
		
		//enqueued
		JOptionPane.showMessageDialog(null, "About to enqueue words onto queue: \nThe end is nigh!");
		q.enqueue("hello");
		q.enqueue("world");
		q.enqueue("this");
		q.enqueue("is");
		q.enqueue("a");
		q.enqueue("test");
		q.enqueue("that");
		q.enqueue("i");
		q.enqueue("am");
		q.enqueue("running");
		q.enqueue("okay");
		

		// Now dequeue them from the queue
		JOptionPane.showMessageDialog(null, "About to dequeue the words ...");
		while(! q.isEmpty()) {
			String word = (String)q.dequeue(); // Note: have to cast Objects popped to String
			JOptionPane.showMessageDialog(null, "Word dequeued: " + word);
		}
		//and repeat as above to further test
		q.enqueue("en");
		q.enqueue("que");
		q.enqueue("ing");
		q.enqueue("this");
		
		JOptionPane.showMessageDialog(null, "About to dequeue the words ...");
		while(! q.isEmpty()) {
			String word = (String)q.dequeue(); // Note: have to cast Objects popped to String
			JOptionPane.showMessageDialog(null, "Word dequeued: " + word);
		}
		q.enqueue("first");
		q.enqueue("second");
		q.enqueue("third");
		q.enqueue("fourth");
		
		JOptionPane.showMessageDialog(null, "About to dequeue the words ...");
		while(! q.isEmpty()) {
			String word = (String)q.dequeue(); // Note: have to cast Objects popped to String
			JOptionPane.showMessageDialog(null, "Word dequeued: " + word);
		}
		q.enqueue("fifth");
		q.enqueue("sixth");
		q.enqueue("seventh");
		q.enqueue("eigth");
		
		JOptionPane.showMessageDialog(null, "About to dequeue the words ...");
		while(! q.isEmpty()) {
			String word = (String)q.dequeue(); // Note: have to cast Objects popped to String
			JOptionPane.showMessageDialog(null, "Word dequeued: " + word);
		}
		System.exit(0);
	}

}

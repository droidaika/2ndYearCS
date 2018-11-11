package QueueArray;
/**
 * M Madden M Schukat: Test the Linked List implementation of the Queue.
 * We will compare it with the ArrayStack: both should work the same.
 * 
 * Note: students may do this comparison different ways.
 */

import java.time.Duration;
import java.time.Instant;

import javax.swing.JOptionPane;


public class LLQueueTest 
{
	public static void main(String[] args) 
	{
		// Create two queues, one using an ArrayQueue and one that's a LLQueue.
		Queue qa = new ArrayQueue(); 
		Queue ql = new LLQueue(); 
		



	    //int selection = JOptionPane.showConfirmDialog(null, getPanel(), "Price Form : ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

		int num = Integer.parseInt(JOptionPane.showInputDialog("How many Strings do you want?", "Enter a number"));
		// Put some strings onto each queue
		
		JOptionPane.showMessageDialog(null, "About to enqueue words onto both LL and Array queues: \nThe end is nigh!");
		Instant start = Instant.now();
		
		
		for(int i = 0; i < num; i++){
			qa.enqueue(Integer.toString(i));
			ql.enqueue(Integer.toString(i));
		}
		

		// Now dequeue items from both queues and compare results
		JOptionPane.showMessageDialog(null, "About to dequeue the words from both queues...");
		while(! qa.isEmpty()) {
			String word1 = (String)qa.dequeue(); // Note: have to cast Objects popped to String
			String word2 = (String)ql.dequeue(); // Note: have to cast Objects popped to String
			JOptionPane.showMessageDialog(null, "Words dequeued: " + word1 + ", " + word2 + "\n" +
					(word1.equals(word2) ? "they match!" : "ERROR: don't match!"));
		}
		// make sure both are empty
		JOptionPane.showMessageDialog(null, "After dequeueing all: Empty? " + qa.isEmpty() + " and " + ql.isEmpty());
		Instant end = Instant.now();
		System.out.println(Duration.between(start, end)); // prints PT1M3.553S
		System.exit(0);
	}
}

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


public class LLQueueTest2 
{
	public static void main(String[] args) 
	{
		// Create two queues, one using an ArrayQueue and one that's a LLQueue.
		Queue qa = new ArrayQueue(); 
		Queue ql = new LLQueue(); 
		



		//gets user input of how many strings they wanna enqueue
		int num = Integer.parseInt(JOptionPane.showInputDialog("How many Strings do you want?", "Enter a number"));		
		JOptionPane.showMessageDialog(null, "About to enqueue words onto both LL and Array queues: \nThe end is nigh!");
		//gets current time to check against time after enqueueing has occured to get the time that it took to run.
		long start = System.currentTimeMillis();
		//enqueues arrayQueue first
		//enqueues the amount of strings that the user requested
		for(int i = 0; i < num; i++){
			qa.enqueue(Integer.toString(i));
			
		}
		//gets tiem after enqueueing has occured
		long end = System.currentTimeMillis();
		//In effect this returns how long the enqueueing  process took
		System.out.println("Enqueuing took " + (end - start) + " milliseconds");
		//gets start time
		start = System.currentTimeMillis();
		// Now dequeues items 
		
		while(! qa.isEmpty()) {
			qa.dequeue(); 
			
		}
		//checks end time
		end = System.currentTimeMillis();
		System.out.println("Dequeuing " + (end - start) + " milliseconds");
		

		//gets start time again
		start = System.currentTimeMillis();
		
		//this time enqueues linked list
		for(int i = 0; i < num; i++){
			
			ql.enqueue(Integer.toString(i));
		}
		//checks end time
		end = System.currentTimeMillis();
		System.out.println("Enqueuing " + (end - start) + " milliseconds");
				

		//gets start time again
		start = System.currentTimeMillis();
		//dequeues linked list
		while(! qa.isEmpty()) {
			
			ql.dequeue(); 
		}
		//calculates time after enqueueing and dequeuing
		end = System.currentTimeMillis();
		
		
		

		
		//calculates difference in time and thus how long enqueueing and dequeueing took
		System.out.println("Dequeuing took " + (end - start) + " milliseconds");
		System.exit(0);
	}
}

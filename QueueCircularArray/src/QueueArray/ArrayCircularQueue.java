/** M Madden, M Schukat, 2005 - 2015: Abstract Stack interface */

package QueueArray;

import javax.swing.JOptionPane;



public class ArrayCircularQueue implements Queue 
{
	 protected Object Q[];				 
	 protected int front = 0;	//edited   added front variable
	 protected int rear = 0;			
	 protected int capacity; 			
	 public static final int CAPACITY = 1000;
	//tells u whether the last action was dequeued or enqueued. 
	 //This can be used by the isFull() and isEmpty() functions to tell whether its full or empty
	 //as current formulas are identical
	 //if last action was dequeueing before front and rear are at same place then we know its empty
	 //and same logic with enqueuing and full
	 private boolean frontMoveLast = true;
	   
	 public ArrayCircularQueue() {
		   //this sets default capcity to 1000
		   this(CAPACITY);
	 }

	 public ArrayCircularQueue(int cap) {
		  //this is a constructor if the user wants an array of a particular size
		  capacity = (cap > 0) ? cap : CAPACITY;
		  Q = new Object[capacity]; 
		  
	 }
	 
	 public void enqueue(Object n)
	 {
		//EDITED
		//this only runs if the array isnt already full 
		
		
		 if (isFull()) {
			 JOptionPane.showMessageDialog(null, "Cannot enqueue object " + n +" ; queue is full.");
			 
		 }else{
			 //frontMoveLast explained when declared up top
			 frontMoveLast = false;
			 // adds object to array at rear and moves rear up one
			 Q[rear] = n;
			 rear++;
		
			 //added the if statement so that when the rear passes the last entry in the array it is reset to 0.
			 //could be done with mod instead.
			 if(rear==capacity){
				 rear= 0;
			 }
		 
		 }
	 }
	 
	 public Object dequeue()
	 {
		 // edited
		//this only runs if there are objects in the array. It moves front up one place and takes the object at that place
		 if (isEmpty()){
			 return null;
		 }else{
			 //frontMoveLast explained when declared up top
			 frontMoveLast= true;
		 
		
		
			 //removed shuffle that pushes all objects in array back one
		
			 //stores dequeued object in temp so it wont be deleted
			 Object temp = Q[front];
			 //added code to remove object when its dequeued
			 Q[front] = null;
			 front++;
			 //added the if statement so that when the front passes the last entry in the array it is reset to 0.
			 //could be done with mod instead.
			 if(front==capacity){
				 front= 0;
			 }
			 //returns dequeued object
			 return temp;
		 }
	 }
	 
	 public boolean isEmpty()  {
		//edited
		 //check if array has any objects in it
		 //changed isEmpty formula as a circular array has different parameters for being empty
		 //frontMoveLast explained when declared up top
		 if(rear == front && frontMoveLast == true){
			 return true;
		 }else{
			 return false;
		 }
	 }
	 
	 public boolean isFull() {
		//edited
		 //checks if there are any empty spaces left in array
		 //changed isFull formula as a circular array has different parameters for being empty
		 //frontMoveLast explained when declared up top
		 if(rear == front && frontMoveLast == false){
			 return true;
		 }else{
			 return false;
			 
		 }
	 }
	 
	 public Object front()
	 {
		 //edited
		 //returns front object but this function is not used in the code
		 if (isEmpty())
			 return null;
		 //changed q[0] to q[front] as 0 is not always the front
		 return Q[front];
	 }
}
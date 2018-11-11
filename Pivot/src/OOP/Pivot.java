package OOP;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class Pivot {
	/*
	 * MY CODE STARTS HERE PART 1 OF 3, PART 2 STARTS AT 275, AND PART 3 STARTS AT 363
	 */
	public static int moves = 0;
	public static int comp= 0;

	public static void main(String[] args)
	{
		
		//creates 4 arrays and calls the randomARray function to randomise them
		String[] unsortedArray1 = RandomArray(6000);
		String[] unsortedArray2 =  (String[])unsortedArray1.clone();

		String[] AscendingSortedArray1 = RandomArray(6000);
		Arrays.sort(AscendingSortedArray1);
		String[] AscendingSortedArray2 =  (String[])AscendingSortedArray1.clone();
		String[] DescendingSortedArray1 = RandomArray(6000);
		Arrays.sort(DescendingSortedArray1, Collections.reverseOrder( ));
		String[] DescendingSortedArray2 =  (String[])DescendingSortedArray1.clone();

		
		System.out.println("old method");
		quickSortPrint(unsortedArray1);
		quickSortPrint(AscendingSortedArray1);
		quickSortPrint(DescendingSortedArray1);
		System.out.println("new way");
		
		newQuickSortPrint(unsortedArray2);
		newQuickSortPrint(AscendingSortedArray2);
		newQuickSortPrint(DescendingSortedArray2);
		
		String[] unsortedArray3 = RandomArray(8000);
		String[] unsortedArray4 =  (String[])unsortedArray3.clone();

		String[] AscendingSortedArray3 = RandomArray(8000);
		Arrays.sort(AscendingSortedArray3);
		String[] AscendingSortedArray4 =  (String[])AscendingSortedArray3.clone();
		String[] DescendingSortedArray3 = RandomArray(8000);
		Arrays.sort(DescendingSortedArray3, Collections.reverseOrder( ));
		String[] DescendingSortedArray4 =  (String[])DescendingSortedArray3.clone();

		
		
		System.out.println("old method");
		quickSortPrint(unsortedArray3);
		quickSortPrint(AscendingSortedArray3);
		quickSortPrint(DescendingSortedArray3);
		System.out.println("new way");
		
		newQuickSortPrint(unsortedArray4);
		newQuickSortPrint(AscendingSortedArray4);
		newQuickSortPrint(DescendingSortedArray4);
		
		String[] unsortedArray5 = RandomArray(10000);
		String[] unsortedArray6 =  (String[])unsortedArray5.clone();

		String[] AscendingSortedArray5 = RandomArray(10000);
		Arrays.sort(AscendingSortedArray5);
		String[] AscendingSortedArray6 =  (String[])AscendingSortedArray5.clone();
		String[] DescendingSortedArray5 = RandomArray(10000);
		Arrays.sort(DescendingSortedArray5, Collections.reverseOrder( ));
		String[] DescendingSortedArray6 =  (String[])DescendingSortedArray5.clone();

		
		
		System.out.println("old method");
		quickSortPrint(unsortedArray5);
		quickSortPrint(AscendingSortedArray5);
		quickSortPrint(DescendingSortedArray5);
		System.out.println("new way");
		
		newQuickSortPrint(unsortedArray6);
		newQuickSortPrint(AscendingSortedArray6);
		newQuickSortPrint(DescendingSortedArray6);
		
	}

	private static void quickSortPrint(String[] temp){
		System.out.println("Quick Sort");
System.out.println("The original array is: "+array2String(temp) +"\nand is " + temp.length + " digits long");

		//calculates time taken for quickSort to run

		long beginTime = System.nanoTime();
		quickSort(temp, new StringComparator());
		long endTime = System.nanoTime();
		long time = endTime - beginTime;
		
		System.out.println("It took "+ (time/1000000) + " ms to sort");
		System.out.println("The number of comparisons are "+comp+" and the number of moves is "+moves);
		System.out.println("The total number of operations are "+(comp+moves));
		//resets counters to 0 so they dont keep continously increasing every time theyre run
		comp = 0;
		moves = 0;
		System.out.println("The final array is: "+array2String(temp) +"\nand is " + temp.length + " digits long" + "\n");
		
		}
		//method to do Shell sort by passing in an array.
		
		public static void quickSort (Object[] arr, Comparator c) {
		 if (arr.length < 2) return; // the array is already sorted in this case
		 quickSortStep(arr, c, 0, arr.length-1); // call the recursive sort method
		}

		/** QuickSortStep method:
		 * Method called by QuickSort(), which sorts the elements of array s between
		 * indices leftBound and rightBound, using a recursive, in-place,
		 * implementation of the quick-sort algorithm.
		**/
		
		private static void quickSortStep (Object[] s, Comparator c,
				int leftBound, int rightBound )
				{
				if (leftBound >= rightBound) return; // the indices have crossed
				Object temp; // temp object used for swapping
				// Set the pivot to be the last element
				Object pivotValue = s[rightBound];

				 // Now partition the array
				 int upIndex = leftBound; // will scan rightward, 'up' the array
				 int downIndex = rightBound-1; // will scan leftward, 'down' the array
				 while (upIndex <= downIndex)
				 {
				 // scan right until larger than the pivot
				 while ( (upIndex <= downIndex) && (c.compare(s[upIndex], pivotValue)<=0) )
				 upIndex++;
				 comp++;
				 // scan leftward to find an element smaller than the pivot
				 while ( (downIndex >= upIndex) && (c.compare(s[downIndex], pivotValue)>=0))
				 downIndex--;
				 comp++;
				 if (upIndex < downIndex) { // both elements were found
				 temp = s[downIndex];
				 s[downIndex] = s[upIndex]; // swap these elements
				 s[upIndex] = temp;
				 moves++;
				 }
				 } // the loop continues until the indices cross

				 int pivotIndex = upIndex;
				 temp = s[rightBound]; // swap pivot with the element at upIndex
				 s[rightBound] = s[pivotIndex];
				 s[pivotIndex] = temp;
				 moves++;
				 // the pivot is now at upIndex, so recursively quicksort each side
				 quickSortStep(s, c, leftBound, pivotIndex-1);
				 quickSortStep(s, c, pivotIndex+1, rightBound);
				}
		
	private static void newQuickSortPrint(String[] temp){
		System.out.println("Quick Sort");
System.out.println("The original array is: "+array2String(temp) +"\nand is " + temp.length + " digits long");

		//calculates time taken for quickSort to run

		long beginTime = System.nanoTime();
		newQuickSort(temp, new StringComparator());
		long endTime = System.nanoTime();
		long time = endTime - beginTime;
		
		System.out.println("It took "+ (time/1000000) + " ms to sort");
		System.out.println("The number of comparisons are "+comp+" and the number of moves is "+moves);
		System.out.println("The total number of operations are "+(comp+moves));

		//resets counters to 0 so they dont keep continously increasing every time theyre run
		comp = 0;
		moves = 0;
		System.out.println("The final array is: "+array2String(temp) +"\nand is " + temp.length + " digits long" + "\n");
		
		}
		//method to do Shell sort by passing in an array.
		
		public static void newQuickSort (Object[] arr, Comparator c) {
		 if (arr.length < 2) return; // the array is already sorted in this case
		 newQuickSortStep(arr, c, 0, arr.length-1); // call the recursive sort method
		}

		/** QuickSortStep method:
		 * Method called by QuickSort(), which sorts the elements of array s between
		 * indices leftBound and rightBound, using a recursive, in-place,
		 * implementation of the quick-sort algorithm.
		**/
		private static void newQuickSortStep (Object[] s, Comparator c,
		 int leftBound, int rightBound )
		{
		 int pivot = (int) (Math.random()*s.length);
		 if (leftBound >= rightBound) return; // the indices have crossed
		 Object temp; // temp object used for swapping
		 Object myTemp;
		 
		 myTemp=s[pivot];
		 s[pivot]=s[rightBound];
		 s[rightBound] = myTemp;
		

		 // Set the pivot to be the last element
		 Object pivotValue = s[pivot];
		 

		 // Now partition the array
		 int upIndex = leftBound; // will scan rightward, 'up' the array
		 int downIndex = rightBound-1; // will scan leftward, 'down' the array
		 while (upIndex <= downIndex)
		 {
		 // scan right until larger than the pivot
		 while ( (upIndex <= downIndex) && (c.compare(s[upIndex], pivotValue)<=0) )
		 upIndex++;
		 comp++;
		 // scan leftward to find an element smaller than the pivot
		 while ( (downIndex >= upIndex) && (c.compare(s[downIndex], pivotValue)>=0))
		 downIndex--;
		 comp++;
		 if (upIndex < downIndex) { // both elements were found
		 temp = s[downIndex];
		 s[downIndex] = s[upIndex]; // swap these elements
		 s[upIndex] = temp;
		 moves++;
		 }
		 } // the loop continues until the indices cross

		 int pivotIndex = upIndex;
		 temp = s[rightBound]; // swap pivot with the element at upIndex
		 s[rightBound] = s[pivotIndex];
		 s[pivotIndex] = temp;
		 moves++;
		 // the pivot is now at upIndex, so recursively quicksort each side
		 newQuickSortStep(s, c, leftBound, pivotIndex-1);
		 newQuickSortStep(s, c, pivotIndex+1, rightBound);
		}
		
		
	
	

	

	private static String array2String(Object[] a)
	{
	String text="[";
	for (int i=0; i<a.length; i++) {
	text += a[i];
	if (i<a.length-1)
	text += ",";
	}
	text += "]";
	return text;
	}
/*
 * MY CODE STARTS HERE PART 3 OF 3 
 */
	private static String[] RandomArray(int length) {
		// TODO Auto-generated method stub
		String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0"};
		String[] output = new String[length];
		for(int i =0; i< length; i++){
			int rand = (int) (Math.random()*36);
			output[i] = letters[rand];
			
		}
		return output;
	}
}
/*
 * MY CODE ends HERE PART 3 OF 3 
 */
class StringComparator implements Comparator
{
	public int compare(Object ob1, Object ob2)
	{
		String s1 = (String)ob1;
		String s2 = (String)ob2;
		//return s1.compareTo(s2); // use compareTo for case-sensitive comparison
		return s1.compareToIgnoreCase(s2);
	}
}

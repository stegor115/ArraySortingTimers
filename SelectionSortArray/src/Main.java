import java.lang.*;

public class Main {
	public static void main(String[] args){
		int[] myArray = new int[10000];
		
		for(int i = 0; i<myArray.length; i++){
			myArray[i] = (int) (Math.random()*100000);
		}//end for
		
		int[] bubbleArray = myArray.clone();
		int[] selectArray = myArray.clone();
		int[] insertArray = myArray.clone();
		
		long intialTime = System.currentTimeMillis();
		System.out.println("Loading...");
		selectionSort(selectArray);
		long timeAfterSelect = System.currentTimeMillis();
		insertionSort(insertArray);
		long timeAfterInsert = System.currentTimeMillis();
		bubbleSort(bubbleArray);
		long timeAfterBubble = System.currentTimeMillis();
		System.out.println("Calculating...");
		System.out.println("Selection sort took " + (timeAfterSelect-intialTime) + "ms");
		System.out.println("Insert sort took " + (timeAfterInsert-intialTime) + "ms");
		System.out.println("Bubble sort took " + (timeAfterBubble-intialTime) + "ms");
	} //end method
	
	public static void print(int[] happyArray){
		int count = 0;
		while(count != happyArray.length){
			System.out.print(happyArray[count] + " ");
			count++;
		} //end while
	} //end method
	
	public static void selectionSort(int[] array){
		int size = array.length;
		int min;
		int mover;
		for(int i = 0; i<size-1; i++){
			min = i;
			for(int j = i+1; j<size; j++){
				if(array[j] < array[i]){
					min = j;
				}//end if
			} //end nested for
			if(min != i){
				mover = array[min];
				array[min] = array[i];
				array[i] = mover;
			}//end if
		}//end for
	}//end method
	
	public static void insertionSort(int[] array){
		int pos;
		int value;
		for(int i= 1; i<array.length;i++){
			value = array[i];
			pos = i;
			while(pos>0 && array[pos-1] > value){
				array[pos] = array[pos-1];
				pos = pos - 1;
			}//end while
			array[pos] = value;
		}//end for
	}//end method
	
	public static void bubbleSort(int[] array){
		int count = 0;
		int temp;
		boolean flag = true;
		while(flag){
			flag = false;
			for(count = 0; count < array.length -1; count++){
				if(array[count] < array[count+1]){
					temp = array[count];
					array[count] = array[count+1];
					array[count+1] = temp;
					flag = true;
				} //end if
			} //end for
			count++;
		}//end while
	}//end method
} //end class

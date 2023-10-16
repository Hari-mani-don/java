package hari;

import java.util.Arrays;


public class Abstract {

	public static void main(String[] args) {
		//Create an integer array
		int[] array = {9,5,0,1,8,3};
		Sortable[] sortable = {new BubbleSort(), new SelectionSort()};
		//Bubble sort print and also selection sort print
		//Acending and decending order
		for(Sortable sort : sortable) {
			System.out.println(Arrays.toString(sort.sort(array)));
		}
//		Sortable sortable = new SelectionSort();
//		System.out.print(Arrays.toString(sortable.sort(array)));
		
	}

}
interface Sortable{
	int[] sort(int[] arr);
}
class BubbleSort implements Sortable {
	
	@Override
	public int[] sort(int[] arr) {
		
		//If check whether a array isEmpty()
		if(arr.length == 1)
			return arr;
		for(int i = 0; i < arr.length-1; i++) {
			int checkSort = 1;
			for(int j = 0; j < arr.length-i-1; j++) {
				// If the condition first element > second element 
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					checkSort = 0;
				}
				
			}
		
			if(checkSort == 1) {
				System.out.print("Hi! hari"); 
				return arr;
			}
		}
		
		return arr;
	}
}
class SelectionSort implements Sortable {
	
	@Override
	public int[] sort(int[] array) {
		//If check whether a array isEmpty()
				if(array.length == 1)
					return array;
				for(int i = 0; i < array.length-1; i++) {
					int checkSort = 1;
					for(int j = i+1; j < array.length; j++) {
						// If the condition first element > second element 
						if(array[i] < array[j]) {
							int temp = array[i];
							array[i] = array[j];
							array[j] = temp;
							checkSort = 0;
							
						}
						
					}
				
					if(checkSort == 1) {
						System.out.print("Hi! mani"); 
						return array;
					}
				}
				
				return array;
			}
}

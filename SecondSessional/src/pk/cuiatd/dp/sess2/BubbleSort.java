package pk.cuiatd.dp.sess2;

//Java program for implementation of Bubble Sort 
class BubbleSort implements Sorting{ 
	void bubbleSort(char arr[]) { 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
				if (arr[j] > arr[j+1]) { 
					// swap arr[j+1] and arr[j] 
					char temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
	} 

	/* Prints the array */
	void printArray(char arr[]) { 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method to test above 
	public void SortMethod(char[] arrr){ 
		BubbleSort ob = new BubbleSort(); 
		char arr[] = arrr; 
		ob.bubbleSort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 


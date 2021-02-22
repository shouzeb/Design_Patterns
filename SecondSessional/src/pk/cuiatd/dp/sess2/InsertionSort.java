package pk.cuiatd.dp.sess2;

 
class InsertionSort implements Sorting{ 
	
	/*Function to sort array using insertion sort*/
	
	void sort(char arr[]) { 
		
		
		
		
		int n = arr.length; 
		
		
		
		for (int i = 1; i < n; ++i) { 
			char key = arr[i]; 
			int j = i - 1; 

			/* Move elements of arr[0..i-1], that are 
			greater than key, to one position ahead 
			of their current position */
			while (j >= 0 && arr[j] > key) { 
				arr[j + 1] = arr[j]; 
				j = j - 1; 
			} 
			arr[j + 1] = key; 
		} 
	} 

	/* A utility function to print array of size n*/
	static void printArray(char arr[]) { 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 

		System.out.println(); 
	} 

	// Driver method 
	public void SortMethod(char[] arrr) { 
		char arr[] = arrr; 

		InsertionSort ob = new InsertionSort(); 
		ob.sort(arr); 

		printArray(arr); 
	} 
} 


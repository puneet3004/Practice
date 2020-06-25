package BubbleSort;

public class BubbleSorting {
		void bubbleSort(int arr[]) 
		{ 
			int n = arr.length; 
			for (int i = 0; i < n-1; i++) 
				for (int j = 0; j < n-i-1; j++) 
					if (arr[j] > arr[j+1]) 
					{ 
						
						int temp = arr[j]; 
						arr[j] = arr[j+1]; 
						arr[j+1] = temp; 
					} 
			System.out.print("Sorted Array: ");
			for (int i=0; i<n; ++i) 
				System.out.print(arr[i] + " "); 
		} 

		public static void main(String args[]) 
		{ 
			BubbleSorting ob = new BubbleSorting(); 
			int arr[] = {60, 14, 35, 55, 33, 18, 74}; 
			ob.bubbleSort(arr); 
			
		} 
	} 
	



package InsertionSort;

public class InsertionSorting {

		public void sort(int arr[]) 
		{ 
			int n = arr.length; 
			for (int i = 1; i < n; ++i) { 
				int k = arr[i]; 
				int j=i-1; 

			
				while (j >= 0 && arr[j] > k) { 
					arr[j + 1] = arr[j]; 
					j = j - 1; 
				} 
				arr[j + 1] = k; 
			} 
			for (int i = 0; i < n; ++i) 
				System.out.print(arr[i] + " "); 
		} 

	
		
		public static void main(String args[]) 
		{ 
			int arr[] = { 41, 12, 54, 51, 61 }; 

			InsertionSorting ob = new InsertionSorting(); 
			ob.sort(arr); 


		} 
	} 



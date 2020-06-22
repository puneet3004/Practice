package SelectionSort;

public class selectionSort {
	void sort(int a[]) {
		
		for(int i=0;i<a.length;i++){
			int min=i;
			int temp;
			for(int j=i+1;j<a.length;j++){
				
				if(a[j]<a[min]){
					min=j;
					}
				}
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
		
					}
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");}
		}
	
	
		public static void main(String[] args){
			
			
			selectionSort ss=new selectionSort();
			int []a={44,65,87,23,76,98,55};
			ss.sort(a);
				
}}

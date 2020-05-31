

import java.util.Scanner;

public class arrayinputfriendnameandnumber {

	private static Scanner s;

	public static void main(String[] args) {
		int length;
		s = new Scanner(System.in);
		System.out.println("enter number of friends you want to add");
		length=s.nextInt();
		
		String []arr=new String[length];
		for(int j=0;j<length;j++) {
			System.out.println("enter your friend name  "+(j+1));
			
			arr[j]=s.next();
		}
		long []arr1=new long[length];
		
		
	for(int k=0;k<length;k++) {
		System.out.println("enter your friend number  "+(k+1));
		
		arr1[k]=s.nextLong();
		}
		System.out.println("Your friends are ");int k=0;k++;
		for(int j=0;j<length;j++) {
			System.out.println(arr[j]+"  "+arr1[k]);
		}
	}
}

package practice;

public class evenoddpattern01 {

	public static void main(String[] args) {
		
		for(int row=1;row<=5;row++) {
			
			for(int col=1;col<=row;col++) {
				if((row+col)%2==0) {
					System.out.print("1 ");
				}
				else
					System.out.print("0 ");				
				
			}
			System.out.println();
		}

	}
	}



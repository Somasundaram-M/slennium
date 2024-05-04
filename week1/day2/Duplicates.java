package week1.day2;

public class Duplicates {
	
	
	public static void main(String[] args) {
		
		int[] dupli= {2,5,7,7,5,9,2,3};
		
		for(int i=0;i<dupli.length;i++) {
			for(int j=i+1;j<dupli.length;j++) {
				if(dupli[i]==dupli[j]) {
					System.out.println(dupli[i]);
				}
			}
		}
	}

}

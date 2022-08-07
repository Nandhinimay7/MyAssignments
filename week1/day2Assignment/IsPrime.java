package week1.day2Assignment;

public class IsPrime {
	
	public static void main(String[] args) {
		int n = 7;
		int temp = 0;
		for (int i=2;i<n-1;i++) {
			if(n%i==0) {
				System.out.println("It is a non-Prime number :"+n);
				temp =1;
				break;
				}
			} 
			if (temp == 0){
				System.out.println(n+" is a prime number");
			}
		}
	

}

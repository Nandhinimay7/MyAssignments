package week1.day1;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -34;
		if(num<0) {
			num = num * -1;
			System.out.println("The converted positive number is: "+num);
		}
		else {
			System.out.println("User has given a positive number: "+num);
		}

	}

}

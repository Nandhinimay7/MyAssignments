package week1.day2;

import java.util.Arrays;

public class ArrayHandson {
	
	public void OddNumbers() {
		for (int i=57;i<78;i++) {
			if (i%2!=0) {
				
				System.out.println("Odd numbers are:"+i+"\n");
			}
		}
	}
	
	public void secLargestNum() {
	int[] number = {22,67,98,1,34,58,99};
	Arrays.sort(number);
	System.out.println(number[number.length-2]);
	
	}
	
	public static void main(String[] args) {
		ArrayHandson array= new ArrayHandson();
		array.secLargestNum();
		array.OddNumbers();
	}

}

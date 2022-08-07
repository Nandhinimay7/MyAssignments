package week1.day2Assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int i=arr[0];i<=arr.length;i++) {
			if(i==arr[i-1]) {
				System.out.println("Iteration Value is equal to Array value "+i);
			}
			else {
				System.out.println("The missing Element in Array is: "+i);
				break;
			}
			}
		}

	

}

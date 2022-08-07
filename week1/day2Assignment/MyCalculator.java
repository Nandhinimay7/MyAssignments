package week1.day2Assignment;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println("Sum of 3 nos: "+calc.add(2, 10, 40));
		System.out.println("Subtraction of 2 nos is:"+calc.sub(25, 5));
		System.out.println("Product of 2 nos is:"+calc.mul(25434565.65456, 23454.9898));
		System.out.println("Division of 2 nos is:"+calc.divide(23.56f, 1.34f));
	}

}

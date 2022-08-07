package week1.day2;

public class Car {
	
	public void carBrand() {
		System.out.println("Car Brand is Mahindra");
	}
	
	public String getCarColor() {
		return "Black";
	}
	public long getEngineNumber() {
		return 345678765678l;
	}
	
	public void calculations(int a, int b) {
		int sub = a-b;
		int mult = a*b;
		int div = a/b;
		System.out.println("Subtraction is: "+sub+"\n"+
						"Product is: "+mult+"\n"+
						"Division is: "+div);
	}
	
	public static void main(String[] args) {
		Car car= new Car();
		car.carBrand();
		System.out.println(car.getCarColor());
		System.out.println(car.getEngineNumber());
		car.getEngineNumber();
		car.calculations(25, 5);
	}
}

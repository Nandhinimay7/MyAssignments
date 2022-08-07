package week1.day1;

public class TwoWheeler {
	int noOfWheels = 4;
	short noOfMirrors =3;
	long chassisNumber = 2345678765445677654l;
	boolean isPunctured = false;
	String bikeName = "Yamaha R15";
	double runningKM = 2343234.767898;
	
	public static void main(String[] args) {
		TwoWheeler twoWheeler = new TwoWheeler();
		
		System.out.println("No. of Wheels : " +twoWheeler.noOfWheels+"\n"+
		"No. of Mirrors:" + twoWheeler.noOfMirrors+"\n"+
		"Chasis Number:" +twoWheeler.chassisNumber+"\n"+
		"Is Wheels Punctured :"+twoWheeler.isPunctured+"\n"+
		"Bike Name:"+twoWheeler.bikeName+"\n"+
		"Running KM:"+twoWheeler.runningKM);
	}

}

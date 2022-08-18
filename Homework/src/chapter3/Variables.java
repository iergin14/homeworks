package chapter3;

public class Variables {
	public static void main(String[] args) {
	
	String driverName;
	int numberOfDriver;
	int totalDriverScore;
	int driverExamScore;
	boolean isPass;
	double averageScore;
	
	
	
	driverName = "ilayda";
	numberOfDriver = 15;
	totalDriverScore = 1083;
	averageScore = (totalDriverScore / numberOfDriver);
	driverExamScore= 80;
	isPass= true;
	
	if(isPass == true) {
		System.out.println(driverName + " " + numberOfDriver + " " + driverExamScore + " "+ averageScore + "points.");
	}
	}
}
import java.awt.Color;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	// Parameter in main-Methode zwingend
	public static void main (String[] args) {
		System.out.println("Hello World");
		
		// Create Cars inside of main function
		Car myCar = new Car(25,null,Color.black,true);
		Scanner sc = new Scanner(System.in);
		System.out.println("Kontrollschild eingeben:" );
		myCar.licensePlate = sc.next();
		System.out.println("Kontrollschild: " + myCar.licensePlate);
		myCar.changePaintColor(Color.blue);
		System.out.println("Farbe:" + myCar.paintColor);
		
		// Call by value: myCarSpeed ain't changed shit
		double myCarSpeed = 50;
		myCar.speedUp(myCarSpeed);
		System.out.println(myCarSpeed);
		
		// Call by reference
		myCarSpeed = myCar.speedUpNow(myCarSpeed);
		System.out.println(myCarSpeed);
	}
}

import java.awt.*;

public class Car {
	double averageMilesPerGallon;
	String licensePlate;
	// Color from awt library
	Color paintColor;
	boolean areTaillightsWorking;
	
	// Constructor method -> creates instances of Car Class
	public Car(double inputAverageMPG, 
			String inputLicensePlate, 
			Color inputPaintColor, 
			boolean inputAreTaillightsWorking) {
		
		this.averageMilesPerGallon = inputAverageMPG;
		this.licensePlate = inputLicensePlate;
		this.paintColor = inputPaintColor;
		this.areTaillightsWorking = inputAreTaillightsWorking;
	}
	
	public void changePaintColor(Color newPaintColor) {
		this.paintColor = newPaintColor;
	}
	
	public void speedUp(double currentSpeed) {
		currentSpeed += 100;
	}
	
	// Change to return function (not void) to return value
	public double speedUpNow(double currentSpeed) {
		currentSpeed += 100;
		return currentSpeed;
	}
}

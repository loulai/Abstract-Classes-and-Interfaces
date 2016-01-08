
public class Car implements MotorVehicle {
	
	int fuel;

	public void run() {
		System.out.println("Vrooooom");
	}

	public int getFuel() {
		return this.fuel;
	}

}


public abstract class MotorVehicleAbstract {
	int fuel;
	int getFuel(){ //now all MotorVehicles will have this, unlike the interface method
		return this.fuel;
	}
	
	abstract void run();
}


public class FourWheeler extends Vehicle{
	public FourWheeler(String c, double hp){
		this.numOfWheels = 4;
		this.color = c;
		this.horsepower = hp;
	}
	
	public FourWheeler(String c, double hp, String u){
		this.numOfWheels = 4;
		this.color = c;
		this.horsepower = hp;
		this.usage = u;
	}
}


public class Test {
	
	public static void main(String[] args){
		/*
		TwoWheeler myBike = new TwoWheeler("Red", 1.2);
		FourWheeler myCar = new FourWheeler("Black", 6.9);
		FourWheeler droneCar = new FourWheeler("White", 4.0, "delivery");
		
		System.out.println("TwoWheeler:");
		System.out.println(myBike.numOfWheels);
		System.out.println(myBike.color);
		System.out.println(myBike.horsepower + "\n");

		System.out.println("FourWheeler:");
		System.out.println(myCar.numOfWheels);
		System.out.println(myCar.color);
		System.out.println(myCar.horsepower);
		
		System.out.println(myCar.usage);
		System.out.println(droneCar.usage);
		*/
		
		CreditCard masterCard = new CreditCard();
		Cheque myCheque = new Cheque();
		
		masterCard.makePayment();
		myCheque.makePayment();
		
		
	}

}

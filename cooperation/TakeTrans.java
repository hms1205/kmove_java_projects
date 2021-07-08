package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward", 20000);
		
		
		Bus bus1004 = new Bus(1004);
		studentJames.takeBus(bus1004);
		studentJames.showInfo();
		bus1004.showInfo();
		
		Subway subwayGreen = new Subway("2È£¼±");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi1234 = new Taxi(1234);
		studentEdward.takeTaxi(taxi1234);
		studentEdward.showInfo();
		taxi1234.showInfo();
	}
}
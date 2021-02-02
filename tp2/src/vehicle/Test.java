package vehicle;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		
		Plane plane1 = new Plane("A770",100,50000,10000);
		Car car1 = new Car("Ford Ka",4,1000,4);
		Car car2 = new Car("Mustang",5,1500,4, Propulsion.DIESEL, 100);
		Glider glider1 = new Glider("B670",100,50000,10000);
		JetFighter jet1 = new JetFighter("A47",1,10000,50000,2000);
		
		vehicles.add(plane1);
		vehicles.add(car1);
		vehicles.add(car2);
		vehicles.add(glider1);
		vehicles.add(jet1);
		
		for(Vehicle v : vehicles) {
			System.out.println(v);
		}
		
		System.out.println("Number of vehicles: " + Vehicle.getNbVehicles());
		
//		System.out.println(plane1);
//		System.out.println(car1);
//		System.out.println(car2);
//		System.out.println(glider1);
//		System.out.println(jet1);
		
	}
	
}

package com.inheritance;

class Vehicle{
	String make;
	String model;
	int    year;
	
	public void displayInfo() {
		System.out.println("make: "+make +",model:"+model+",year: "+year);
}

}
	
class Car extends Vehicle{

	 int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		
		this.make=make;
		this.model=model;
		this.year=year;
		this.numberOfDoors=numberOfDoors;

	}
	public void displayCarInfo() { 
 	 	System.out.println("Numbers of Doors:"+numberOfDoors); 
 	} 

	
}


class Truck extends Vehicle{

	 int cargoCapacity;

	public Truck(String make, String model, int year, int cargoCapacity) {
		
		this.make=make;
		this.model=model;
		this.year=year;
		this.cargoCapacity=cargoCapacity;

	}

	
	public void displayTruckInfo() {
		System.out.println("Cargo Capacity: "+cargoCapacity +"kg");
	}	
	
}

class Motorcycle extends Vehicle{

	 boolean hasSideCar;
	 
 	public Motorcycle(String make, String model, int year,boolean hasSideCar) {
 		this.make=make;
		this.model=model;
		this.year=year;
		this.hasSideCar = hasSideCar;
	}

	public void displayMotorCycleInfo(){  	 	
 		if (hasSideCar==true) { 
 	 	 	System.out.println("Has Sidecar:"+true); 
 	 	} else { 
 	 	 	System.out.println("Has Sidecar:"+false); 
 	 	} 
 	} 

}



public class VehicleMain {
	public static void main(String[] args) {
		Vehicle car=new Car("Toyota","Corolla", 2022,4);  	 	
		car.displayInfo(); 
 	 	((Car)car).displayCarInfo(); 
 	 	
 	 	System.out.println();
 	 	
 	 	Vehicle truck=new Truck("Ford","Corolla", 2021,1000);  	 	
		truck.displayInfo(); 
 	 	((Truck)truck).displayTruckInfo(); 	
 	 	
 	 	System.out.println();
 	 	
 	 	Vehicle motorcycle=new Motorcycle("Harley-Davidson", "Street Glide", 2023, true);  	 	
		motorcycle.displayInfo(); 
 	 	((Motorcycle)motorcycle).displayMotorCycleInfo() ; 	
 	 	
	}
}


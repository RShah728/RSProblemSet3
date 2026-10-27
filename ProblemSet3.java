package edu.monmouth.problemSet3;

import edu.monmouth.campusvehicle.CampusVehicle;
import edu.monmouth.campusvehicle.Color;

public class ProblemSet3 {

	public static void main(String[] args) {

		
		CampusVehicle campusVehicle1 = new CampusVehicle();
		
		System.out.println("Campus Vehicle 1 ID: " + campusVehicle1.getId());
		System.out.println("Campus Vehicle 1 Location: " + campusVehicle1.getLocation());
		System.out.println("Campus Vehicle 1 Available: " + campusVehicle1.isAvailable());
		System.out.println("Campus Vehicle 1 Color: " + campusVehicle1.getColor());

		
		campusVehicle1.setId("MU11111");
		campusVehicle1.setLocation("Parking Lot");
		campusVehicle1.setAvailable(false);
		campusVehicle1.setColor(Color.BLUE);

		
		
		System.out.println();

		
		System.out.println("---------Campus Vehicle 1 Updated----------");
		System.out.println("Campus Vehicle 1 ID: " + campusVehicle1.getId());
		System.out.println("Campus Vehicle 1 Location: " + campusVehicle1.getLocation());
		System.out.println("Campus Vehicle 1 Available: " + campusVehicle1.isAvailable());
		System.out.println("Campus Vehicle 1 Color: " + campusVehicle1.getColor());

		
		
		System.out.println();

		
		
		CampusVehicle campusVehicle2 = new CampusVehicle("MU22222", "Spruce Hall", true, Color.RED);

		
		System.out.println("Campus Vehicle 2 ID: " + campusVehicle2.getId());
		System.out.println("Campus Vehicle 2 Location: " + campusVehicle2.getLocation());
		System.out.println("Campus Vehicle 2 Available: " + campusVehicle2.isAvailable());
		System.out.println("Campus Vehicle 2 Color: " + campusVehicle2.getColor());
		
		
		System.out.println();

		
		
		campusVehicle2.setColor(Color.ORANGE);
		
		
		System.out.println("---------Campus Vehicle 2 Color Updated----------");
		System.out.println("Campus Vehicle 2 ID: " + campusVehicle2.getId());
		System.out.println("Campus Vehicle 2 Location: " + campusVehicle2.getLocation());
		System.out.println("Campus Vehicle 2 Available: " + campusVehicle2.isAvailable());
		System.out.println("Campus Vehicle 2 Color (Updated Color): " + campusVehicle2.getColor());
		
		
		System.out.println();

		
		
		
		CampusVehicle campusVehicle3 = new CampusVehicle("MU33333", "Library", true, Color.GREEN);


		System.out.println("Campus Vehicle 3 ID: " + campusVehicle3.getId());
		System.out.println("Campus Vehicle 3 Location: " + campusVehicle3.getLocation());
		System.out.println("Campus Vehicle 3 Available: " + campusVehicle3.isAvailable());
		System.out.println("Campus Vehicle 3 Color: " + campusVehicle3.getColor());
		
		
		System.out.println();

		
		
		CampusVehicle campusVehicle4 = new CampusVehicle("MU444", "Random", true, Color.BLACK);
		
		
		System.out.println("Campus Vehicle 4 ID (Invalid ID): " + campusVehicle4.getId());
		System.out.println("Campus Vehicle 4 Location (Invalid Location): " + campusVehicle4.getLocation());
		System.out.println("Campus Vehicle 4 Available: " + campusVehicle4.isAvailable());
		System.out.println("Campus Vehicle 4 Color: " + campusVehicle4.getColor());
		
		
		System.out.println();
		
		
		CampusVehicle campusVehicle5 = new CampusVehicle("MU55555", "Library", true, Color.YELLOW);


		System.out.println("Campus Vehicle 5 ID: " + campusVehicle5.getId());
		System.out.println("Campus Vehicle 5 Location: " + campusVehicle5.getLocation());
		System.out.println("Campus Vehicle 5 Available: " + campusVehicle5.isAvailable());
		System.out.println("Campus Vehicle 5 Color: " + campusVehicle5.getColor());
		

		
	}

}

import java.util.Scanner;

public class MowingTime {

	public static void main(String[] args) {
		double length;
		double width;
		double area;
		double time;
		Scanner scan = new Scanner(System.in);
		
		do {// get length
			System.out.println("please enter a length: ");
			while (!scan.hasNextDouble()) {
				System.out.println("An integer please!!!");
				scan.next();
			}
			length = scan.nextDouble();
			if (length < 1) System.out.println("Please enter a valid length.");
		} while (length < 1);
		
		do {// get width
			System.out.println("please enter a width");
			while (!scan.hasNextDouble()) {
				System.out.println("An integer please!!!");
				scan.next();
			}
			width = scan.nextDouble();
			if (length < 1) System.out.println("Please enter a valid length.");
		} while (length < 1);
		
		area = width * length;
		time = area / 20;
		
		System.out.printf("This lawn with length %s and width %s has an area of %s and should take you no more than %s minutes to finish mowing!", length, width, area, time);
		
		scan.close();
	}

}

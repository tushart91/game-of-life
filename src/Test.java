import java.awt.Point;

import java.util.ArrayList;

//import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * 
		 * 
		 * System.out.println("Enter grid size: ");
		 * 
		 * int gridSize = Integer.parseInt(scan.nextLine());
		 * 
		 * 
		 * 
		 * ArrayList<Point> bacteria = new ArrayList<Point>();
		 * 
		 * System.out.println("Enter no of bacterias: "); int bacteriaSize =
		 * Integer.parseInt(scan.nextLine());
		 * 
		 * System.out.println("Enter first bacteria's position: ");
		 * 
		 * for(int i = 0; i<bacteriaSize; i++) {
		 * 
		 * String line = scan.nextLine();
		 * 
		 * Scanner lineScanner = new Scanner(line);
		 * 
		 * 
		 * 
		 * int x = lineScanner.nextInt();
		 * 
		 * int y = lineScanner.nextInt();
		 * 
		 * 
		 * 
		 * bacteria.add(new Point(x,y));
		 * 
		 * System.out.println("Enter next bacteria's position: ");
		 * 
		 * }
		 */
		ArrayList<Point> bacteria = new ArrayList<Point>();
		bacteria.add(new Point(1, 1));
		bacteria.add(new Point(1, 3));
		bacteria.add(new Point(2, 2));
		bacteria.add(new Point(3, 1));
		bacteria.add(new Point(3, 3));
		bacteria.add(new Point(4, 2));
		bacteria.add(new Point(4, 4));

		Grid grid = new Grid(4, bacteria);
		System.out.println(grid);
		
		for (int i = 0; i < 3; i++) {
			grid.nextState(grid.nextGeneration());
			System.out.println(grid);
		}
	}

}

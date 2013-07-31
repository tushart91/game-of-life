import java.awt.Point;


public class Cell {
	private Point position;
	private boolean isalive;
	public Cell(Point position) {
		this.position = position;
		isalive = false;
	}
	
	public void updateCell() {
		if(isalive) isalive = false;
		else isalive = true;
	}
	
	public boolean isAlive() {
		return (isalive == true);
	}
	
	public String toString() {
		if(isalive) return "o";
		else return "";
	}
}

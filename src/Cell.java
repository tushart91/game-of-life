public class Cell {

	private boolean isalive;

	public Cell() {
		isalive = false;
	}

	public void updateCell() {
		isalive = !isalive;
	}

	public boolean isAlive() {
		return (isalive == true);
	}

	public String toString() {
		if (isalive)
			return "O";
		else return "+";
	}
}

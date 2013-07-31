import java.awt.Point;
import java.util.ArrayList;

public class Grid {

	private Point size;
	Cell[][] cells;

	public Grid(int Size, ArrayList<Point> input) {
		size = new Point(Size, Size);
		cells = new Cell[Size + 2][Size + 2];
		for (int i = 0; i < Size + 2; i++) {
			for (int j = 0; j < Size + 2; j++) {
				cells[i][j] = new Cell();
			}
		}

		for (int i = 0; i < input.size(); i++)
			cells[input.get(i).x][input.get(i).y].updateCell();
	}

	public ArrayList<Point> nextGeneration() {
		ArrayList<Point> updatePoints = new ArrayList<Point>();
		updatePoints.clear();
		for (int i = 1; i <= size.x; i++) {
			for (int j = 1; j <= size.y; j++) {
				Boolean living = cells[i][j].isAlive();
				int livingNeighbourCount = LivingNeighbors(i, j);
				
				if (living && (livingNeighbourCount > 3 || livingNeighbourCount < 2))
					updatePoints.add(new Point(i, j));
				else if (!living && livingNeighbourCount == 3)
					updatePoints.add(new Point(i, j));
			}
		}
		return updatePoints;
	}
	
	public void nextState(ArrayList<Point> updatePoints) {
		for (int i = 0; i < updatePoints.size(); i++)
			cells[updatePoints.get(i).x][updatePoints.get(i).y].updateCell();
	}

	public Integer LivingNeighbors(int i, int j) {
		Integer count = 0;
		if (cells[i - 1][j - 1].isAlive())
			count++;
		if (cells[i - 1][j].isAlive())
			count++;
		if (cells[i - 1][j + 1].isAlive())
			count++;
		if (cells[i][j - 1].isAlive())
			count++;
		if (cells[i][j + 1].isAlive())
			count++;
		if (cells[i + 1][j - 1].isAlive())
			count++;
		if (cells[i + 1][j].isAlive())
			count++;
		if (cells[i + 1][j + 1].isAlive())
			count++;
		return count;
	}
	
	public String toString() {
		String grid = "";
		for (int i=1; i <= size.x; i++) {
			for (int j=1; j <= size.y; j++) {
				grid += cells[i][j].toString();
			}
			grid += "\n";
		}
		return grid;
	}
}

import java.util.ArrayList;

public class File {
	private int fileSize;
	private ArrayList<Knot> knots;
	
	
	public File(int fileSize) {
		knots = new ArrayList<Knot>();
		this.fileSize = fileSize;
	}
	
	public Knot getKnot(int index) {
		return knots.get(index);
	}
	
	public void addKnot(Knot knot) {
		knots.add(knot);
	}
	
	public void removeKnots() {
		for (Knot knot : knots) {
		}
		knots.clear();
	}
	
	public int fileSize() {
		return fileSize;
	}

}
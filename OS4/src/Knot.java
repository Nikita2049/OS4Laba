public class Knot {
	private int knotId;
	private Knot knot;

	public Knot(int knotId) {
		this.knotId = knotId;
	}

	public int getKnotId() {
		return knotId;
	}
	
	public void setKnot(int knotId) {
		knot = new Knot(knotId);
	}

	public Knot nextKnot() {
		return knot;
	}
}
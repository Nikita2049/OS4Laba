public class Knot {

    private int knotId;
    private boolean selectFlag;
    private Knot knot;

    public Knot(int knotId) {
        this.knotId = knotId;
    }

    public void setKnot(int knotId) {
    	knot = new Knot(knotId);
    }

    public int getKnotId() {
        return knotId;
    }

    public Knot nextKnot() {
        return knot;
    }

    public boolean getSelectFlag() {
        return selectFlag;
    }

    public void setSelectFlag(boolean selectFlag) {
        this.selectFlag = selectFlag;
    }
}
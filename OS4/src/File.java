public class File {
    private int fileSize;
    private int fileId;
    private Knot knot;

    public File(int fileId, int fileSize) {
        this.fileId = fileId;
        this.fileSize = fileSize;
    }

    public Knot getKnot() {
        return knot.nextKnot();
    }

    public int getId() {
        return fileId;
    }

    public int fileSize() {
        return fileSize;
    }
}
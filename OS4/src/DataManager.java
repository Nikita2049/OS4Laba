import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DataManager {
    public ArrayList<File> Files = new ArrayList<File>();
    private int chsize;
    int fileId;
    private int freeMemory = Block.count;
    private ArrayList<Knot> uzels = new ArrayList<Knot>();;

    public void CreateFile(int size, String name) {
        chsize = 0;
        fileId = Files.size();
        if (size > freeMemory) {
            Main.textAreaWindow.append("Невозможно добавить файл! \n");
            JOptionPane.showMessageDialog(null, "Недостаточно памяти!");
            return;
        }
        else {
            File file = new File(fileId, size);
            for (int i = 0; i <= Block.count; i++) {
                if (size > chsize) {
                    if (Block.memory.get(i).getId() != -1) {
                        while (Block.memory.get(i).getId() != -1) {
                            i++;
                        }
                    }
                    int fileId = file.getId();
                    addKnot(Block.memory.get(i), fileId);
                    freeMemory--;
                    chsize++;
                }
                if (size == chsize) {
                    Files.add(fileId, file);
                    Main.textAreaWindow.append("Добавлен файл с именем "+name+" с №" + fileId + "\n");
                    Main.textAreaWindow.append("Свободно памяти:" + freeMemory + "\n");
                    return;
                }
            }
        }
    }

    public void DeleteFile(int id) {
        if (Files.get(id) == null) {
            Main.textAreaWindow.append("Данного файла не сущетвует! \n");
            JOptionPane.showMessageDialog(null, "Данного файла не сущетвует!");
            return;
        } else {
            freeMemory = freeMemory + Files.get(id).fileSize();
            removeKnots(id);
            Main.textAreaWindow.append("Удалён файл с именем "+Main.textId.getName()+" с № " + Main.textId.getText() + "\n");
        }
        Main.textAreaWindow.append("Свободно памяти:" + freeMemory + "\n");

    }

    public void ChoiceFile(int id) {
        if (Files.get(id) == null) {
            Main.textAreaWindow.append("Данного файла не сущетвует! \n");
            JOptionPane.showMessageDialog(null, "Данного файла не сущетвует!");
            return;
        } else {
            for (int i=0; i<knots.size(); i++) {
                Knot knot= knots.get(i);
                knot.setSelectFlag(true);
            }
        }
    }

    public void cancelChoiceFile() {
        for(int j=0; j<uzels.size(); j++) {
            uzels.get(j).setSelectFlag(false);
        }
    }
    public void addKnot(Knot knot, int fileid) {
        knots.add(knot);
    }

    public void removeKnots(int fileId) {
        for(int i=0; i<uzels.size(); i++) {
            if (knots.get(i).getId() == fileId) {
            	knots.get(i).setFile(-1);
            }
        }
        knots.clear();
    }
}
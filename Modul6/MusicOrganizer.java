import java.util.ArrayList;

public class MusicOrganizer {
    private ArrayList<String> files;

    // Initierer klassen og feltene
    public MusicOrganizer() {
        files = new ArrayList<>();
    }
		// Legg til filer
    public void addFiles(String filename) {
        files.add(filename);
    }
		// Hent number av filer
    public int getNumberOfFiles() {
        return files.size();
    }

}
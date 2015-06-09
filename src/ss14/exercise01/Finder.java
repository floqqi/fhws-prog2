package ss14.exercise01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finder {

    // a)
    public BufferedReader getSystemInAsBufferedReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    // b)
    public void findStringInFiles(String searchString, String[] filenames) {
        for(String filename: filenames) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
                String line;
                int i = 1;
                while((line = br.readLine()) != null) {
                    if(line.contains(searchString)) {
                        System.out.println("Datei: " + filename + "; Zeile: " + i);
                    }
                    i++;
                }
                br.close();
            } catch (IOException e) {
                System.out.println("Kann Datei " + filename + " nicht oeffnen.");
            }
        }
    }

    public static void main(String[] args) {
        Finder finder = new Finder();
        BufferedReader br = finder.getSystemInAsBufferedReader();
        String searchString;
        try {
            searchString = br.readLine();
            finder.findStringInFiles(searchString, args);
            br.close();
        } catch (IOException ex) {
            System.out.println("Einlesen fehlgeschlagen.");
        }
    }
}

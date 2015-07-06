package ws1314.exercise05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class VocabularyTrainer extends AbstractVocabularyTrainer {

    // a)
    public String readLineFromSystemIn() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try {
            line = br.readLine();
            br.close();
        } catch (IOException e) {
            line = "";
        }
        return line;
    }

    // b)
    public void load(String filename) throws IllegalArgumentException {
        this.dictionary = new HashMap<String, String>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            int counter = 0;
            String currentLine, lineBefore = null;
            while ((currentLine = br.readLine()) != null) {
                counter++;
                if (counter % 2 == 0) {
                    this.dictionary.put(lineBefore, currentLine);
                    counter = 0;
                }
                lineBefore = currentLine;
            }
            br.close();
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
    }

    // c)
    public String getRandomFirstLanguageWord() {
        return (String) this.dictionary.keySet().toArray()[(int) Math.floor(Math.random() * this.dictionary.size())];
    }

    // d)
    public boolean testTranslation(String lang1, String lang2) {
        String word = this.dictionary.get(lang1);
        return word != null && word.toLowerCase().equals(lang2.toLowerCase());
    }

    public static void main(String[] args) {
        new VocabularyTrainer().runTraining();
    }
}

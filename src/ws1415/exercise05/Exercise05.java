package ws1415.exercise05;

import java.io.*;

public class Exercise05 {

    public static void main(String[] args) {
        try {
            // a)
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("data.txt")
                    )
            );

            // b)
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

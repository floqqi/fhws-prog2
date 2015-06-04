package ws1415.exercise03;

import java.io.*;

public class OutputStreamDoubler extends OutputStream {
    OutputStream o1 = null;
    OutputStream o2 = null;

    // a)
    OutputStreamDoubler(OutputStream o1, OutputStream o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    // b)
    public void close() throws IOException {
        this.o1.close();
        this.o2.close();
    }

    // c)
    public void write(int b) throws IOException {
        boolean thrown = false;

        try {
            this.o1.write(b);
        } catch (IOException e) {
            thrown = true;
        }

        try {
            this.o2.write(b);
        } catch (IOException e) {
            thrown = true;
        }

        if (thrown) {
            throw new IOException();
        }
    }

    // d)
    public static void main(String[] args) {
        try {
            OutputStreamDoubler osd = new OutputStreamDoubler(
                    new FileOutputStream("file1"),
                    new FileOutputStream("file2")
            );

            ObjectOutputStream oos = new ObjectOutputStream(osd);
            oos.writeObject("Hello World");

            oos.close();
            osd.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

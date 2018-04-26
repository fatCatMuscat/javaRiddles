package IO;

import java.util.Formatter;

public class createFile {


    private Formatter x;

    public void openFile(String fileName) {
        try {
            x = new Formatter(fileName);
        }
        catch (Exception e) {
            System.out.println("File not created / opened ERROR");
        }
    }

    public void addRecords(String record) {
        x.format(record);
    }

    public void close() {
        x.close();
    }


}

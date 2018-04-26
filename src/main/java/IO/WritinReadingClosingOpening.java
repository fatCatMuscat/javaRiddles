package IO;

public class WritinReadingClosingOpening {


    public static void main(String[] args) {

        createFile cf = new createFile();
        cf.openFile("Drums.txt");
        cf.addRecords("Pour me a pint!");
        cf.close();
    }
}

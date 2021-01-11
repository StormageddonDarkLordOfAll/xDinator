import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.io.*;
import java.util.Scanner;

public class main {
   // xDDDDDD
    //xDDDDDDD
    //xDDDDDDDDxDxDD
    //xDDDDDDDDD
    public static void main(String[] args) {
        try {
            File myObj = new File("bin\\xD.txt");
            Scanner reader = new Scanner(myObj);
                String line = "";
                if(!reader.hasNextLine()){
                    line="xD";
                    FileWriter myWriter = new FileWriter("bin\\xD.txt");
                    myWriter.write("xD");
                    myWriter.close();
                }
                else{
                    line = reader.nextLine();
                    line +="D";
                    FileWriter myWriter = new FileWriter("bin\\xD.txt");
                    myWriter.write(line);
                    myWriter.close();
                }
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection stringSelection = new StringSelection(line);
            clipboard.setContents(stringSelection, null);
            } catch (IOException e) {
                e.printStackTrace();
            }


    }

}

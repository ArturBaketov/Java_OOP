package HomeWork2;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class SaveDocumentXml extends SaveDocument {

    public SaveDocumentXml() {
        super.scan = new Scanner(System.in);
    }

    @Override
    void EnterSaveDoс(String puthDoc, String nameDoc) {
        try {
            String expansion = ".xml";
            if (new File(puthDoc + "/" + nameDoc + expansion).isFile() != true) {
                Writer fw = new FileWriter(puthDoc + "/" + nameDoc + expansion);
                String input = scan.nextLine();
                fw.write(input);
                fw.close();
            } else {
                Writer fw = new FileWriter(puthDoc + "/" + nameDoc + expansion, true);
                String input = scan.nextLine();
                fw.append("\n" + input);
                fw.close();
            }
        } catch (Exception e) {
            System.out.println("Произошла неведомая ошибка!");
        }
    }

    @Override
    void LineSaveDoс(String puthDoc, String nameDoc, String line) {
        try {
            String expansion = ".xml";
            if (new File(puthDoc + "/" + nameDoc + expansion).isFile() != true) {
                Writer fw = new FileWriter(puthDoc + "/" + nameDoc + expansion);
                fw.write(line);
                fw.close();
            } else {
                Writer fw = new FileWriter(puthDoc + "/" + nameDoc + expansion, true);
                fw.append("\n" + line);
                fw.close();
            }
        } catch (Exception e) {
            System.out.println("Произошла неведомая ошибка!");
        }
    }
}

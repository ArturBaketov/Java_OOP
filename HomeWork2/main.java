package HomeWork2;

public class Main {
    public static void main(String[] args) {
        SaveDocument txt = new SaveDocumentTxt();
        SaveDocument json = new SaveDocumentJson();
        SaveDocument xml = new SaveDocumentXml();

        txt.LineSaveDoс("job/DOC", "file", "Иван Иванов=4.8");
        txt.LineSaveDoс("job/DOC", "file", "Мария Кузнецова=5.0");
        txt.LineSaveDoс("job/DOC", "file", "Степан Кузьмин=3.6");

        json.LineSaveDoс("job/DOC", "file", "{");
        json.LineSaveDoс("job/DOC", "file", "\"Иван Иванов\": 4.8,");
        json.LineSaveDoс("job/DOC", "file", "\"Мария Кузнецова\": 5.0,");
        json.LineSaveDoс("job/DOC", "file", "\"Степан Кузьмин\": 3.6");
        json.LineSaveDoс("job/DOC", "file", "}");

        xml.LineSaveDoс("job/DOC", "file", "<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
        xml.LineSaveDoс("job/DOC", "file", "<students>");
        xml.LineSaveDoс("job/DOC", "file", "<student>");
        xml.LineSaveDoс("job/DOC", "file", "<name>Иван Иванов</name>");
        xml.LineSaveDoс("job/DOC", "file", "<grade>4.8</grade>");
        xml.LineSaveDoс("job/DOC", "file", "</student>");
        xml.LineSaveDoс("job/DOC", "file", "<student>");
        xml.LineSaveDoс("job/DOC", "file", "<name>Мария Кузнецова</name>");
        xml.LineSaveDoс("job/DOC", "file", "<grade>5.0</grade>");
        xml.LineSaveDoс("job/DOC", "file", "</student>");
        xml.LineSaveDoс("job/DOC", "file", "<student>");
        xml.LineSaveDoс("job/DOC", "file", "<name>Степан Кузьмин</name>");
        xml.LineSaveDoс("job/DOC", "file", "<grade>3.6</grade>");
        xml.LineSaveDoс("job/DOC", "file", "</student>");
        xml.LineSaveDoс("job/DOC", "file", "</students>");

    }

}

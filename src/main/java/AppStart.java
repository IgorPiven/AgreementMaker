import Handlers.FileHandler;
import Handlers.FinalTextHandler;
import Handlers.LineHandler;
import Readers.DiscountsReader;
import Readers.FilePdfReader;
import Readers.InputFileReader;


public class AppStart {

    public static void main(String[] args) {

        FileHandler.saveToFile(FinalTextHandler.generateFileText(LineHandler.handleLine(DiscountsReader.loadDiscounts(),
                FilePdfReader.readPdf(InputFileReader.chooseFile()))));
    }
}






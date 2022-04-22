package Readers;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilePdfReader {

    public static List<String> readPdf(String fileName) {

        List<String> pageTextFromFile = new ArrayList<>();

        try {
            PdfReader reader = new PdfReader(fileName);
            int n = reader.getNumberOfPages();

            for (int i = 1; i <= n; i++) {

                String pageContent = PdfTextExtractor.getTextFromPage(reader, i);

                pageTextFromFile.add(pageContent);

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Split content into single lines
        List<String> textLineByLine = new ArrayList<>();

        for (int i = 0; i < pageTextFromFile.size(); i++) {

            String currentLine = pageTextFromFile.get(i);

            String[] linesArray = currentLine.split("\n");

            for (int j = 0; j < linesArray.length; j++) {

                textLineByLine.add(linesArray[j]);

            }

        }

        return textLineByLine;
    }

}

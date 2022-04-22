package Handlers;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public static void saveToFile(StringBuilder dataToFile) {

        FileWriter writer;

        try {

            writer = new FileWriter("AgreementText.txt");
            writer.write(String.valueOf(dataToFile));

            writer.flush();
            writer.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Unexpected error while processing the file", "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null,
                "Check file AgreementText.txt to obtain the text for Agreement", "Successfully",
                JOptionPane.INFORMATION_MESSAGE);

    }
}

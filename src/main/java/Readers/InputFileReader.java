package Readers;

import javax.swing.*;
import java.io.File;


public class InputFileReader {

    private static JFileChooser fileOpen = new JFileChooser();
    private static String fileExtension = "";

    public static String chooseFile() {

        while (!fileExtension.equals("pdf")) {

            int ret = fileOpen.showDialog(null, "Open file to handle");

            if (ret == JFileChooser.CANCEL_OPTION || ret == JFileChooser.ERROR_OPTION) System.exit(0);

            if (ret == JFileChooser.APPROVE_OPTION) {

                File file = new File(String.valueOf(fileOpen.getSelectedFile()));
                String fileName = file.getName();

                if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
                    fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
            }

            if (!fileExtension.equals("pdf"))
                JOptionPane.showMessageDialog(null, "File must have PDF extension", "Error",
                        JOptionPane.ERROR_MESSAGE);
        }

        return String.valueOf(fileOpen.getSelectedFile());
    }

}


package Readers;

import DataBase.DbConnector;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class DiscountsReader {

    public static Map<String, List<String>> loadDiscounts() {

        Map<String, List<String>> discounts = new HashMap<>();

        try {

            Statement statement;
            ResultSet resSet;
            DbConnector.connect();

            statement = DbConnector.conn.createStatement();

            resSet = statement.executeQuery("SELECT * FROM discounts;");

            while (resSet.next()) {

                discounts.put(resSet.getString("discount"),
                        new ArrayList<>(Arrays.asList(resSet.getString("descr_ru"),
                                resSet.getString("descr_en"),
                                "no discount")));
            }

            DbConnector.close();

        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Database error", "Error",
                    JOptionPane.ERROR_MESSAGE);

            System.exit(0);
        }

        if (discounts.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No discounts data downloaded", "Error",
                    JOptionPane.ERROR_MESSAGE);

            System.exit(0);
        }

        return discounts;
    }


}

package DataBase;

import java.sql.*;

public class DbConnector {
    public static Connection conn;
    public static Statement statement;
    public static ResultSet resSet;

    private static final String DB_FILE_NAME = "TestBase.db";


    // --------Connection to a Database--------
    public static void connect() throws ClassNotFoundException, SQLException {

        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:"+DB_FILE_NAME);

    }


    // --------Closing a connection--------
    public static void close() throws ClassNotFoundException, SQLException {

        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (statement != null) statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (resSet != null) resSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

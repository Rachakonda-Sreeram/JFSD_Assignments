package dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

    public static Connection getDBConnection() {
        Connection conn = null;
        FileReader reader = null; // Add declaration for reader

        try {
            reader = new FileReader("resources/database.properties");

            Properties properties = new Properties();
            properties.load(reader);

            String driverclass = properties.getProperty("driverclass");
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            Class.forName(driverclass);
            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Close the FileReader in the finally block
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return conn;
    }
}

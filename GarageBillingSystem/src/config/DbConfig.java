package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
    // ✅ Add ?useSSL=false&allowPublicKeyRetrieval=true to avoid SSL warnings
    private static final String URL = "jdbc:mysql://localhost:3306/grage?useSSL=false&allowPublicKeyRetrieval=true";

    private static final String USER = "root";
    private static final String PASS = "khushi01";

    public static Connection getConnection() throws SQLException {
        try {
            // ✅ Ensure MySQL 8.x driver is loaded properly
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(URL, USER, PASS);
    }
}

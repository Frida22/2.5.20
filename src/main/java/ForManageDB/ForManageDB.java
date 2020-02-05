package ForManageDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ForManageDB {
    static final String DB_CONNECTION = "jdbc:mysql://192.168.31.50:3306/mydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String DB_USER = "admin";
    static final String DB_PASSWORD = "admin123456";
    static Connection connection;


    public static void main(String[] args) throws SQLException {
        connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
        initDB();
    }

    private static void initDB() throws SQLException {
        Statement statement = connection.createStatement();
        try {
            statement.execute("DROP TABLE IF EXISTS Users");
            statement.execute("CREATE TABLE Users (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, name VARCHAR(20) NOT NULL, age INT )");
        } finally {
            statement.close();
        }
    }
    private static void addNewUser() throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT Users(name, age) VALUES ('Bond',5),('Anna',7),('Andrew',12)");
        statement.close();

    }
}



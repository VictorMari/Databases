package lab.login;
import java.sql.*;

/**
 * Hello world!
 */
public class MysqlDBConnection {
    // The following connection string is pointing to Oracle XE database.
    // Change this URL to match your target Oracle database (XE or else)
    final static String DB_URL="jdbc:oracle:thin:@//localhost:3306/users";
    // Enter the database user
    final static String DB_USER = "labosis";
    // Enter the database password
    final static String DB_PASSWORD = "123123as";
    final static String CONN_FACTORY_CLASS_NAME="oracle.jdbc.pool.OracleDataSource";

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/users";
        String username = "labosis";
        String password = "123123as";


        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}

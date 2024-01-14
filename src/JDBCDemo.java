import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "********";

        Class.forName("org.postgresql.Driver");
        Connection dbconnection = DriverManager.getConnection(url, username, password);

        System.out.println("Connection established " + dbconnection);
    }
}

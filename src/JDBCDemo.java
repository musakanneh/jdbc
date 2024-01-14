import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "***";

        Connection dbconnection = DriverManager.getConnection(url, username, password);
        System.out.println("Connection established " + dbconnection);

        Statement statement = dbconnection.createStatement();
        ResultSet getAccount = statement.executeQuery(
                "select * from board"
        );
        getAccount.next();
        System.out.println(getAccount.getString("name"));

        dbconnection.close();
    }
}
package week10;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class q3 {
    private static Logger log= LogManager.getLogger(q3.class);
    public static void main(String[] args) {
        String str = "select name from students where id=6;";
        String url = "jdbc:mysql://localhost:3306/std";
        String srt="skaldh";
        String username = "root";
        String pass = "password";
        try (
                Connection con = DriverManager.getConnection(url, username, pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(str)
        ) {
            System.out.println("Connection successful");
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            if (e.getMessage().contains("Communications link failure") ||
                    e.getMessage().contains("Unknown database") ||
                    e.getMessage().contains("Access denied")||
                    e.getMessage().contains("No suitable driver found")){
                System.out.println("Exception: SQLException - Could not connect to the database.");
                log.error("Log: [ERROR] DatabaseConnectionException occurred.");
            } else {
                System.out.println("Exception: SQLException - An error occurred during the database operation.");
                log.error("Log: [ERROR] DatabaseConnectionException occurred.");
            }
        } finally {
            System.out.println("Connection closed");
        }
    }
}

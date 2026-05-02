package week10;
import java.sql.*;
public class q2 {
    public void custom() throws Mex {
        String str = "select name from students where id=6;";
        String url = "jdbc:mysql://localhost:3306/std";
        String srt="skaldh";
        String username = "root";
        String pass = "password";

        try (
                Connection con = DriverManager.getConnection(srt, username, pass);
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
                throw new Mex("Exception: SQLException - Could not connect to the database.");
            } else {
                throw new Mex("Exception: SQLException - An error occurred during the database operation.");
            }
        } finally {
            System.out.println("Connection closed");
        }
    }
    public static void main(String[] args) {
q2 ob=new q2();
try{
    ob.custom();
} catch (Mex e) {
    System.out.println(e.getMessage());
}
    }
}

package week10;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.*;
public class q7 {
    private static Logger log= LogManager.getLogger();
    public void pr(String url,String username,String password) throws Mex {
        try {
            Connection con= DriverManager.getConnection(url,username,password);
            System.out.println("Connection Successful");
            String str="Select name from students where id=5;";
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery(str);
            while(rs.next())
            {
                System.out.println(rs.getString("name"));
            }
            con.close();
        } catch (SQLException e) {
            if(conn(e))
            {
                log.error("Log: [ERROR] DatabaseOperationException occurred.");
                throw new Mex("Exception: SQLException - Could not connect to the database.");
            }
            else
            {
                log.error("Log: [ERROR] DatabaseOperationException occurred.");
                throw new Mex("Exception: SQLException - An error occurred during the database operation.");
            }
        }
        finally {
            System.out.println("connection closed.");
            log.info("Log: [INFO] Database connection closed successfully.");
        }
    }
    private boolean conn(SQLException e)
    {
        String msg=e.getMessage();
        return (e.getMessage().contains("Communications link failure") ||
                e.getMessage().contains("Unknown database") ||
                e.getMessage().contains("Access denied")||
                e.getMessage().contains("No suitable driver found"));
    }

    public static void main(String[] args) {
        q7 ob=new q7();
        String url = "jdbc:mysql://localhost:3306/std";
        String username = "root";
        String pass = "password";
        try{
            ob.pr(url,username,pass);
        } catch (Mex e) {
            System.out.println(e.getMessage());
        }
    }
}

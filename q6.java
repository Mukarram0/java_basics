package week10;

import java.sql.*;
class excp extends Exception
{
    public excp(String str)
    {super(str);}

}
public class q6 {
    public void pr(String url,String username,String password) throws excp {
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
                throw new excp("Exception: SQLException - Could not connect to the database.");
            }
            else
            {
                throw new excp("Exception: SQLException - An error occurred during the database operation.");
            }
        }
        finally {
            System.out.println("connection closed.");
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
        q6 ob=new q6();
        String url = "jdbc:mysql://localhost:3306/std";
        String username = "root";
        String pass = "password";
        try{
            ob.pr(url,username,pass);
        } catch (excp e) {
            System.out.println(e.getMessage());
        }
    }
}

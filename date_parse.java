package practice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
class InvalidDateException extends Exception
{
    public InvalidDateException(String str)
    {
        super(str);
    }
}
class InvalidSalaryException extends Exception
{
    public InvalidSalaryException(String str)
    {
        super(str);
    }
}
public class date_parse {
    static int insert;
    static int skip;
    static int sin;
     static int din;
    static Connection conn;
    public static void main(String[] args) {
        String line;
        try{
            String url="jdbc:mysql://localhost:3306/e_db";
            String user="root";
            String pass="password";
            conn= DriverManager.getConnection(url,user,pass);
            BufferedReader br=new BufferedReader(new FileReader("D:\\Mca_java\\src\\practice\\emp.txt"));
            while((line= br.readLine())!=null)
                {
                    try{
                        new date_parse().inst(line);
                        insert++;
                    } catch (InvalidDateException e) {
                       skip++;
                       din++;
                    } catch (InvalidSalaryException e) {
                        skip++;
                        sin++;
                    }
                }
           System.out.println("inserted: "+insert);
           System.out.println("skip: "+skip);
           System.out.println("invalid salary: "+sin);
           System.out.println("invalid date: "+din);
           conn.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void inst(String str) throws InvalidSalaryException,InvalidDateException
    {
        String[]arr=str.split(",");
        String q="insert into employ(id,name,salary,date)values(?,?,?,?);";
        int id=Integer.parseInt(arr[0]);
        String name=arr[1];
        double salary=Double.parseDouble(arr[2]);
        String date=arr[3];
        if(salary<0)
        {
            throw new InvalidSalaryException("");
        }
        if(!isvalid(date))
        {
            throw new InvalidDateException("");
        }
        try(PreparedStatement pr=conn.prepareStatement(q))
        {
            pr.setInt(1, id);
            pr.setString(2, name);
            pr.setDouble(3, salary);
            pr.setString(4, date);
            pr.executeUpdate();
        } catch (SQLException e) {
            System.out.println("db error: "+e.getMessage());
        }
    }
    public boolean isvalid(String date) {
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate.parse(date, format);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

}

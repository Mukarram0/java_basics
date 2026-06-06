package practice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class p_match {
    public void match()
    {
        try{
            BufferedReader br=new BufferedReader(new FileReader("D:\\Mca_java\\src\\practice\\password.txt"));
            String line;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the password : ");
            String str=sc.nextLine();
            boolean found=false;
            while((line=br.readLine())!=null)
            {
                if(str.equals(line))
                {
                    found=true;
                    break;
                }
            }
            if(found)
            {
                System.out.println("valid user ");
            }
            else
            {
                System.out.println("invalid user");
            }
            br.close();
        }catch (Exception e)
        {
         System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        p_match m=new p_match();
        m.match();
    }
}

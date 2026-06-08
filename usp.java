package hash;
import java.util.Scanner;
class except extends Exception
{
    public except(String str)
    {
        super(str);
    }
}
public class usp {
    public void exp() throws except
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<10)
        {
            throw new except("number is less than 2 digit ");
        }
    }
    public static void main(String[] args) {
        usp p=new usp();
        try{
            p.exp();
        } catch (except e) {
            System.out.println(e.getMessage());
        }
    }
}

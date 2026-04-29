package week9;

import org.apache.logging.log4j.*;

import java.io.File;
import java.util.Scanner;

public class uncheck {
    private static final Logger log= LogManager.getLogger();
    public void null_file()
    {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter file name: ");
        name=sc.nextLine();
        try{
            File file=null;
            file.getName();
        } catch (NullPointerException e) {
            System.out.println(e);
            log.error("Log: [ERROR] NullPointerException occurred.");
        }
    }
    public void index_out()
    {
        try{
            int[]arr=new int[5];
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            log.error("Log: [ERROR] ArrayIndexOutOfBoundsException occurred.");
        }
    }
    public void Null_obj()
    {
        try{
            String str=null;
            System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println(e);
            log.error("Log: [ERROR] NullPointerException occurred.");
        }
    }

    public static void main(String[] args) {
        uncheck er=new uncheck();
        er.null_file();
        er.index_out();
        er.Null_obj();
    }
}


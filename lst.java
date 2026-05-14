package hash;
import java.util.LinkedList;
import java.util.Scanner;
class std
{
    private int marks;
    private String name;
    public std(String n,int m)
    {
        marks=m;
        name=n;
    }
    public String toString()
    {
        return(name+" "+marks);
    }
}
public class lst {
    public static void main(String[] args) {
        LinkedList<String> st=new LinkedList<>();
        LinkedList<Integer> in=new LinkedList<>();
       LinkedList<std> two=new LinkedList<>();
       Scanner Sc=new Scanner(System.in);
       int n;
       System.out.println("enter size : ");
       n=Sc.nextInt();
       System.out.println("enter names: ");
       Sc.nextLine();
       for(int i=0;i<n;i++)
       {
           st.add(Sc.nextLine());
       }
       System.out.println("enter marks: ");
       for(int i=0;i<n;i++)
       {
            in.add(Sc.nextInt());
       }

       for (int i=0;i<n;i++)
       {
           two.add(new std(st.get(i),in.get(i)));
       }
       System.out.println("result: ");
       for(std s: two)
       {
           System.out.println(s);
       }

    }
}

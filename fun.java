import java.util.Scanner;
public class fun
{


public static void fib(int n)
{
    int a=0,b=1,fb;
    for(int i=0;i<n;i++)
    {
        fb=a+b;
        System.out.print(" "+a);
        a=b;
        b=fb;
    }
}
public static void main(String[] args)
{
        Scanner in=new Scanner(System.in);
        System.err.println("Enter the number for fibbonacci sequence: ");
        int n=in.nextInt();
        fib(n);
}
}
import java.util.Scanner;
public class recur
{
public static void fib(int a,int b,int n)
{
    if(n==0)
    {
        return;
    }
    System.out.print(" "+a);
    fib(b,b+a,n-1);
   
}
public static void main(String[] args)
{
    Scanner in=new Scanner(System.in);
    System.err.println("Enter the number for fibbonacci sequence: ");
    int n=in.nextInt();
    fib(0,1,n);

}
}
import java.util.Scanner;
public class rr{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter fib sequence: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        System.out.print(fib(i)+" ");
        }
        
    }
    static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
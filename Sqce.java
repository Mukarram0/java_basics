import java.util.Scanner;
public class Sqce
{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number ");
n=sc.nextInt();
System.out.println("number"+" "+"square"+" "+"Cube");
for(int i=1;i<=n;i++)
{
int sq=i*i;
int cb=i*i*i;
System.out.println(" "+i+"\t"+sq+"\t"+cb);
}
}
}

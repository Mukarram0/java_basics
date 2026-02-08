import java.util.Scanner;
public class Recp
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the range: ");
int n=sc.nextInt();
double sum=0;
for(double i=1;i<=n;i++)
{
sum+=1/i;
}
System.out.println("sum of reciprocal: "+sum);
}
}

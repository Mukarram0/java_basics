import java.util.Scanner;
public class Even
{
public static void main(String[] args)
{
System.out.println("enter the range: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
if(i%2==0)
{
sum+=i;
}
}
System.out.println("sum of even number is "+sum);
}
}
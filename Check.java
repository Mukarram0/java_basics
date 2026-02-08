import java.util.Scanner;
public class Check
{
public static void main(String[] args)
{
System.out.println("enter how many number you want to enter: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ev=0,od=0;
for(int i=0;i<n;i++)
{
System.out.println("enter number: ");
int inp=sc.nextInt();
if(inp%2==0)
{
ev++;
}
else
{
od++;
}
}
System.out.println("no. of odd number is "+od);
System.out.println("no. of even number is "+ev);
}


}
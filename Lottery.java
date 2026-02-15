import java.util.Scanner;
public class Lottery{
public static void main(String[] args)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter first number: ");
a=sc.nextInt();
System.out.println("enter second number: ");
b=sc.nextInt();
System.out.println("enter third number: ");
c=sc.nextInt();
int[] digit={a,b,c};
if(digit[0]==digit[1] && digit[1]==digit[2])
{
System.out.println("possible combinations: ");
System.out.println(a+""+b+""+c);
return;
}
System.out.println("possible combinations: ");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
for(int k=0;k<3;k++)
{
if(i!=j && j!=k && i!=k)
{
if(digit[i]!=0)
{
System.out.println(digit[i]+""+digit[j]+""+digit[k]);
}
}
}
}
}
}
}
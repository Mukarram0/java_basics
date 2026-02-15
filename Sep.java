import java.util.Scanner;
public class Sep
{
public static void main(String[] args)
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number: ");
num=sc.nextInt();
int count=0,temp=num;
while(temp!=0)
{
temp=temp/10;
count++;
}
temp=num;
int digit;
while(count!=0)
{
int power=(int)Math.pow(10,count-1);
digit=temp/power;
System.out.println(digit);
temp=temp%power;
count--;
}
}
}
import java.util.Scanner;
public class Floyd
{
public static void main(String[] args)
{
int choice;
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows: ");
n=sc.nextInt();
int count=0;
System.out.println("choice=1(floyd's triangle) or choice=2(alternate of floyd's triangle");
choice=sc.nextInt();
switch(choice)
{
case 1:
{
for(int i=0;i<n;i++)
{
for(int j=0;j<i;j++)
{
count++;
System.out.print(count+" ");
}
System.out.println();
}
break;
}
case 2:
{
for(int i=0;i<n;i++)
{
for(int j=0;j<i;j++)
{
if((i+j)%2==0)
{
System.out.print("0"+" ");
}
else
{
System.out.print("1"+" ");
}
}
System.out.println();
}
break;
}

}
}
}
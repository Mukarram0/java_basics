import java.util.Scanner;
public class Intersection
{
public static void main(String[] args)
{
int x1,y1,width1,height1;
int x2,y2,width2,height2;
Scanner sc=new Scanner(System.in);
System.out.println("enter the coordinates of rectangle 1: ");
x1=sc.nextInt();
y1=sc.nextInt();
System.out.println("enter width and height of rectangle 1: ");
width1=sc.nextInt();
height1=sc.nextInt();
System.out.println("enter the coordinates of rectangle 2: ");
x2=sc.nextInt();
y2=sc.nextInt();
System.out.println("enter width and height of rectangle 2: ");
width2=sc.nextInt();
height2=sc.nextInt();
int left,right,top,bottom;
left=(x1>x2)?x1:x2;
bottom=(y1>y2)?y1:y2;
right=(x1+width1)<(x2+width2)?(x1+width1):(x2+width2);
top=(y1+height1)<(y2+height2)?(y1+height1):(y2+height2);
if(right<=left || top<=bottom)
{
System.out.println("no intersection.");
}
else
{
int interWidth  = right - left;
int interHeight = top - bottom;
System.out.println("intersection:("+left+","+bottom+","+interWidth+","+interHeight+")");
}
}
}
package week_4;
import java.util.Scanner;
public class Geometry {
    int r;
    Scanner sc=new Scanner(System.in);
    Geometry()
    {
        int radius;
        System.out.println("enter radius: ");
        radius=sc.nextInt();
        r=radius;
    }
    public void area()
    {
        double Area;
        Area=Math.PI*r*r;
        System.out.println("Area= "+Area);
    }
    public void perimeter()
    {
        double peri;
        peri=2*Math.PI*r;
        System.out.println("perimeter= "+peri);
    }
    public void circle()
    {

        System.out.println("enter the center(h,k): ");
        int h=sc.nextInt();
        int k=sc.nextInt();
        System.out.println("enter the point(x,y): ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        double dist=Math.sqrt((x-h)*(x-h)+(y-k)*(y-k));
        if(dist<r)
        {
            System.out.println("point ("+x+","+y+") is inside the circle");
            return;
        }
        else if (dist==r) {
            System.out.println("point ("+x+","+y+") is on the circle");
            return;
        }
        else
        {
            System.out.println("point ("+x+","+y+") is outside the circle");
            return;
        }

    }
    public static void main(String[] args) {
        Geometry g1=new Geometry();
        g1.circle();
        g1.area();
        g1.perimeter();
    }
}

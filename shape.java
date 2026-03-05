package week_6;

import java.util.Scanner;

interface shapes
{
    Scanner sc=new Scanner(System.in);
    double getArea();
    void draw();
}
class circle implements shapes {
    double area, rad;

     public double getArea() {
        System.out.println("Create a circle with radius= ");
        rad = sc.nextDouble();
        area = Math.PI * rad * rad;
        return area;
    }

    public void draw() {
        System.out.println("area= " + area);
        System.out.println("drawing circle......");
    }
}
class rectangle implements shapes {
    double area,width, height;

    public double getArea() {
        System.out.print("Create a rectangle with width= ");
        width = sc.nextDouble();
        System.out.print(","+"height= ");
        height= sc.nextDouble();
        area = width*height;
        return area;
    }

    public void draw() {
        System.out.println("area= " + area);
        System.out.println("drawing rectangle......");
    }
}
class triangle implements shapes {
    double area, base,height;

    public double getArea() {
        System.out.println("Create a triangle with base= ");
        base = sc.nextDouble();
        System.out.print(","+"height= ");
        height= sc.nextDouble();
        area = 0.5*base*height;
        return area;
    }
    public void draw() {
        System.out.println("area= " + area);
        System.out.println("drawing triangle......");
    }
}
public class shape {
    Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        shape sh=new shape();
       circle cr=new circle();
       triangle tr=new triangle();
       rectangle rr=new rectangle();
       String choice;
       System.out.println(" choice='c' for circle , choice='t' for triangle , choice='r' for rectangle");
       System.out.print("choice= ");
       choice=sh.in.nextLine();
       switch (choice)
       {
           case "c":
           {
               cr.getArea();
               cr.draw();
               break;
           }
           case "t":
           {
               tr.getArea();
               tr.draw();
               break;
           }
           case "r":
           {
               rr.getArea();
               rr.draw();
               break;
           }
           default:
           {
               System.out.println("wrong choice.");
               break;
           }
       }
    }
}

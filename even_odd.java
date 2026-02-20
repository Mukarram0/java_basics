package week_4;

import java.util.Scanner;
class even_odd
{
    int ev=0,od=0,n;
    public void check()
    {
        System.out.println("enter how many number you want to check: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter number: ");
        for (int i = 0; i < n; i++) {
            int inp = sc.nextInt();
            if (inp % 2 == 0) {
                ev++;
            } else {
                od++;
            }
        }
        System.out.println("no. of even= " + ev);
        System.out.println("no. of odd= " + od);
    }
    public static void main(String[] args) {
        even_odd ed=new even_odd();
        ed.check();
    }
}



package hash;

import java.util.Scanner;

public class prime {
    public boolean isvalid(int n)
    {
        if(n%2==0)
        {
            return false;
        }
        for(int i=3;i<n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
     int num;
     prime ob=new prime();
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int nrstprime=0;
        for(int i=2;i<num;i++)
        {
            if(ob.isvalid(i))
            {
                nrstprime=i;
            }
        }
        System.out.println("nearest prime= "+nrstprime);
    }
}

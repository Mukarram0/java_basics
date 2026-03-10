package practice;

import java.util.Scanner;

public class composite {
    public void composite()
    {
        int s,e;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range of composite");
        s=sc.nextInt();
        e= sc.nextInt();
        int cnt=0;
        for(int i=s+1;i<e;i++)
        {
            cnt=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    cnt++;
                    if(cnt>=3)
                    {
                        sum+=i;
                        break;
                    }
                }
            }
        }
        System.out.println("sum of composite:"+sum);
    }
    public static void main(String[] args)
    {
        composite cm=new composite();
        cm.composite();
    }
}

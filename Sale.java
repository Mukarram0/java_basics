package week_4;
import java.util.Scanner;
class Sale {
    static int sales;

    Sale(int sales)
    {
        this.sales=sales;
    }
    public void commission()
    {
        double Com=0;
        if(sales<0)
        {
            System.out.println("negative values not allowed");
            return;
        }
        else if(sales<500)
        {
            Com=sales*0.02;
        }
        else if (sales>=500&&sales<5000) {
            Com=sales*0.05;
        }
        else if(sales>=5000)
        {
            Com=sales*0.08;
        }
        System.out.println("commission= "+Com);
    }

    public static void main(String[] args) {
        int s;
        System.out.println("enter the sales value: ");
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
    Sale Sa=new Sale(s);
    Sa.commission();

    }

}

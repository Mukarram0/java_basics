package week_6;

import java.util.Scanner;

public class lexico {
    Scanner sc=new Scanner(System.in);

    void lex_print()
    {
        int n;
        System.out.println("how many words you want to enter: ");
        n=sc.nextInt();
        sc.nextLine();
        String []str=new String[n];
        System.out.println("enter the words: ");
        for(int i=0;i<n;i++)
        {
            str[i]=sc.nextLine();
        }
        for(int i=0;i< str.length-1;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                if(str[i].compareToIgnoreCase(str[j])>0)
                {
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("lexicographically: ");
        for(int i=0;i< str.length;i++)
        {
            System.out.println(str[i]);
        }
    }

    public static void main(String[] args) {
        lexico lx=new lexico();
        lx.lex_print();
    }

}

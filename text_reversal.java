package week_6;

import java.util.Scanner;

public class text_reversal {
    Scanner sc=new Scanner(System.in);
    public void text()
    {
        String str;
        str=sc.nextLine();
        char[] ch=str.toCharArray();
        char[] left=new char[ch.length];


        int j=0,st=0;
        for(int i=0;i<=ch.length;i++)
        {
            if(i==ch.length || ch[i]==' ') {
                for (int p = i - 1; p >= st; p--) {
                    left[j++] = ch[p];
                }

                if (i < ch.length) {
                    left[j++] = ch[i];
                }
                st = i + 1;
            }
        }
        System.out.println(left);
    }

    public static void main(String[] args) {
        text_reversal ob=new text_reversal();
        ob.text();
    }
}

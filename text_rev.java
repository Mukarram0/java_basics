package week_6;

import java.util.Scanner;

class text_rev {
    private String rev;
    text_rev(String r)
    {
        rev=r;
    }
    public void rev()
    {
        String res="";
        String[] ch=rev.split(" ");
            for(String chs:ch) {
                String str="";
                for (int j = chs.length()- 1; j >= 0; j--) {
                 str+=chs.charAt(j);
                }
                res+=str+" ";
            }
            System.out.println("string= "+res);
    }

     public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("string: ");
        str=sc.nextLine();
        text_rev txt=new text_rev(str);
        txt.rev();
     }
}

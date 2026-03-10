package practice;

import java.util.Scanner;

interface words
{
    void change_words(String snt);
    int vowels(String snt);

}
class TextAnalyzer implements words
{
    Scanner sc=new Scanner(System.in);
    int words_count=0;
    public void change_words(String snt)
    {
      String[] arr=snt.split(" ");
      String temp;
     // String[]rs=new String[arr.length];
          temp=arr[0];
          arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
      snt=String.join(" ",arr);
      System.out.println("after swap: "+snt);
    }
    public int vowels(String snt)
    {
        String str=snt.toUpperCase();
        char[]arr=str.toCharArray();
        int count_vowels=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
            {
               count_vowels++;
            }
        }
        return count_vowels;
    }
}
public class chage_wrd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("enter the sentence: ");
        str=sc.nextLine();
        TextAnalyzer txt=new TextAnalyzer();
        txt.change_words(str);
        System.out.print("total vowels: "+txt.vowels(str));
    }
}

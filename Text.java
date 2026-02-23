package week_4;

import java.util.Scanner;

class Text {
    String text;

    public void set() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text: ");
        text = sc.nextLine();

    }
}
class inputtext extends Text
{

public void words() {
    int words = 0;
    char[] arr = text.toCharArray();
    for (int i = 0; i < text.length(); i++) {
        if (arr[i] == ' ' || arr[i] == '.') {
            words++;
        }
    }
    System.out.println("no. of words= " + words);

}

public void sentence() {
    int sent = 0;
    char[] arr = text.toCharArray();
    for (int i = 0; i < text.length(); i++) {
        if (arr[i] == '.') {
            sent++;
        }
    }
    System.out.println("no. of sentence= " + sent);

}

public void e_z() {
    int e = 0, z = 0;
    char[] arr = text.toCharArray();
    for (int i = 0; i < text.length(); i++) {
        if (arr[i] == 'e' || arr[i] == 'E') {
            e++;
        } else if (arr[i] == 'z' || arr[i] == 'Z') {
            z++;
        }
    }
    System.out.println("no. of e= " + e);
    System.out.println("no. of z= " + z);

}

public static void main(String[] args) {

    inputtext t = new inputtext();
    t.set();
    t.words();
    t.sentence();
    t.e_z();
}
}

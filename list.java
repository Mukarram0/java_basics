package hash;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String>s=new ArrayList<>();
        ArrayList<String>s1=new ArrayList<>();
        s.add("hello");
        s.add("i am zaheen");
        s1.add("hi ");
        s1.add("i am faizan");
        s1.addAll(s);
        System.out.println(s1);
    }
}

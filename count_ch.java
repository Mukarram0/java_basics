package hash;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class count_ch {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new FileReader("D:\\Mca_java\\src\\hash\\in.txt"));
            String l;
            HashMap<Character,Integer>fr=new HashMap<>();
            HashMap<String,Integer> st=new HashMap<>();
            System.out.println(fr);
            while((l=br.readLine())!=null)
            {
                for(char ch: l.toLowerCase().toCharArray())
                {
                    if(Character.isLetter(ch))
                    {
                        fr.put(ch,fr.getOrDefault(ch,0)+1);
                    }
                }
                String[] str=l.toLowerCase().split(" ");
                for(String s:str)
                {
                    if(st.containsKey(s))
                    {
                        st.put(s,st.get(s)+1);
                    }else
                    {
                        st.put(s,1);
                    }
                }

            }
            System.out.println("character counts: ");
            System.out.println(fr);
            System.out.println("______________________________________");
            System.out.println("words counts: ");
            System.out.println(st);
            System.out.println("______________________________________");
            br.close();
        }catch (IOException e)
        {

        }


    }
}

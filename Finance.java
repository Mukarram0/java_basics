package week8;
import org.apache.logging.log4j.*;

public class Finance {
    private static final Logger log= LogManager.getLogger(Finance.class);
    public static void divideExcp()
    {
        int a=10,b=0;
        try
        {
            int res=a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception: "+e);
            log.error("Logged: ArithmeticException occurred");
        }
    }
    public static void array()
    {
        int[]arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        try {
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception: "+e);
            log.error("Logged: ArrayIndexOutOfBoundsException occurred");
        }
    }
    public static void Nul() {
        String st = null;
        try {
            System.out.println(st.length());

        }
        catch (NullPointerException e)
        {
            System.out.println("Exception: "+e);
            String str="Logged: NullPointerException occurred";
            log.error(str);
        }
    }
    public static void main(String[] args) {
        Finance f=new Finance();
        f.divideExcp();
        f.Nul();
        f.array();
    }
}

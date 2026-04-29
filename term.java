package week9;
import org.apache.logging.log4j.*;
public class term {
    private static final Logger log= LogManager.getLogger(logging.class);
    public int divide() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
            log.error("ArithmeticException occurred.");
        }
        return -1;
    }
    public int array() {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
            log.error("ArrayIndexOutOfBoundsException occurred.");
        }
        return -1;
    }
    public int nul() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
            log.error("NullPointerException occurred.");
        }
        return -1;
    }
    public static void main(String[] args) {
        term obj = new term();
        System.out.println("Application terminated with error code: "+obj.divide());
        System.out.println("Application terminated with error code: "+obj.array());
        System.out.println("Application terminated with error code: "+obj.nul());
    }
}


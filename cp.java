package week9;
import java.io.*;
import java.util.Scanner;
import org.apache.logging.log4j.*;
public class cp {
    private static Logger logs = LogManager.getLogger(cp.class);
    public void create_file() throws Mukarram_Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the filename: ");
        String str = sc.nextLine();

        File file = new File(str);

        try {
            if (file.createNewFile()) {
                System.out.println("file is created.");
            } else {
                System.out.println("file already exists.");
            }
        } catch (IOException e) {
            logs.error("IOException occurred", e);
            throw new Mukarram_Exception("File creation failed");
        }
    }
    public void wrt() throws Mukarram_Exception {
        try (FileWriter wr = new FileWriter("inp.txt")) {
            wr.write("10 a 30");   // change to "10 abc 30" to test
        } catch (IOException e) {
            logs.error("Write error", e);
            throw new Mukarram_Exception("Writing failed");
        }
    }
    public void rd() throws Mukarram_Exception {
        try (Scanner sc = new Scanner(new File("inp.txt"))) {
            if (!sc.hasNext()) {
                logs.error("IllegalArgumentException occurred.");
                throw new IllegalArgumentException("No data provided.");
            }
            while (sc.hasNext()) {
                String line = sc.next();

                try {
                    int digit = Integer.parseInt(line);
                    System.out.println(digit);
                } catch (NumberFormatException e) {
                    logs.error("InvalidDataException occurred.");
                    throw new Mukarram_Exception(
                            "\"" + line + "\" is not a valid number."
                    );
                }
            }
            System.out.println("No exception");
        } catch (FileNotFoundException e) {
            logs.error("File not found", e);
            throw new Mukarram_Exception("File not found");
        }
    }
    public static void main(String[] args) {
        cp obj = new cp();

        try {
            obj.create_file();
            obj.wrt();
            obj.rd();
        } catch (Mukarram_Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
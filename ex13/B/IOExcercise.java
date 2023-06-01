import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExcercise {
    public static void main(String[] args) throws IOException {
        File file = new File("number.data");
        double inputDouble;

        BufferedReader stdin = null;
        try {
            stdin = new BufferedReader(new InputStreamReader(System.in));
            
            inputDouble = Double.parseDouble(stdin.readLine());
        } catch (IOException e) {
            System.err.println("Failed to read standard input.");
            throw e;
        } finally {
            if (stdin != null) stdin.close();
        }

        double s1 = Math.sqrt(inputDouble);

        System.out.printf("Square root of %.1f is %.1f\n", inputDouble, s1);

        
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(
                new BufferedOutputStream(
                    new FileOutputStream(file)));
            
            out.writeDouble(s1);

            System.out.printf("The square root value %.1f is written to the file \"number.data\".\n", s1);
        } catch (FileNotFoundException e) {
            System.err.println("File 'number.data' not found.");
            throw e;
        } catch (IOException e) {
            System.err.println("Failed to write file 'number.data'.");
            throw e;
        } finally {
            if (out != null) out.close();
        }

        double s2;
        DataInputStream in = null;
        try {
            in = new DataInputStream(
                new BufferedInputStream(
                    new FileInputStream(file)));
            
            s2 = in.readDouble();

            System.out.printf("The value read from the file 'number.data' is %.1f\n", s2);
        } catch (FileNotFoundException e) {
            System.err.println("File 'number.data' not found.");
            throw e;
        } catch (IOException e) {
            System.err.println("Failed to read file 'number.data'.");
            throw e;
        } finally {
            if (in != null) in.close();
        }

        System.out.printf("Square of %.1f is %.1f\n", s2, s2*s2);
    }
}
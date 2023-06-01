import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReverseString {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        FileInputStream fin = null;
        List<Integer> reversedData = new ArrayList<Integer>();
        try {
            fin = new FileInputStream(inputFile);

            int ch;
            while ((ch = fin.read()) != -1)
                reversedData.add(0, ch);
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            if (fin != null) fin.close();
        }

        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(outputFile);
            
            for (int ch : reversedData)
                fout.write(ch);
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            if (fout != null) fout.close();
        }
    }
}
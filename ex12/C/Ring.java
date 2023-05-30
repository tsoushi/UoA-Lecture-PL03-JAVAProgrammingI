import java.util.Scanner;

public class Ring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        text += text;
        String key = sc.nextLine();

        if (text.contains(key)) System.out.println("Yes");
        else System.out.println("No");

        sc.close();
    }
}
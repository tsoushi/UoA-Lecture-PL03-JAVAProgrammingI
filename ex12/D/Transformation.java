import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String text = sc.nextLine();
        int cmdCount = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < cmdCount; i++) {
            String cmds[] = sc.nextLine().split(" ");
            String cmd = cmds[0];
            int arg1 = Integer.parseInt(cmds[1]);
            int arg2 = Integer.parseInt(cmds[2]);

            if (cmd.equals("print")) {
                System.out.println(text.substring(arg1, arg2 + 1));
            } else if (cmd.equals("reverse")) {
                String reversedText = "";
                for (char c : text.substring(arg1, arg2 + 1).toCharArray())
                    reversedText = c + reversedText;
                text = text.substring(0, arg1) + reversedText + text.substring(arg2 + 1, text.length());                
            } else if (cmd.equals("replace")) {
                text = text.substring(0, arg1) + cmds[3] + text.substring(arg2 + 1, text.length());
            }
        }
    }
}
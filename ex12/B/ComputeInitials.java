public class ComputeInitials {
    public static void main(String[] args) {
        String names[] = args[0].split(" ");

        System.out.println("My initials are: " + names[0].substring(0, 1) + names[1].substring(0, 1));
    }
}
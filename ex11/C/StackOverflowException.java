public class StackOverflowException extends Exception {
    public StackOverflowException(int value) {
        super("Overflow. " + String.valueOf(value) + " can not be pushed.");
    }
}

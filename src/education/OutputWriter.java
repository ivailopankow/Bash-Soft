package education;

/**
 * Created by Ivaylo on 25-Jan-17.
 */
public class OutputWriter {

    public void writeMessage(String message) {
        System.out.print(message);
    }

    public void writeMessageOnNewLine(String message) {
        System.out.println(message);
    }

    public void writeEmptyLine() {
        System.out.println();
    }

    public void displayException(String message) {
        writeMessage(message);
    }
}

import java.util.Scanner;
public class InputHandler {
        private Scanner reader;

        public InputHandler() {
            reader = new Scanner(System.in);
        }

        public Scanner getScanner() {
            return reader;
        }
}

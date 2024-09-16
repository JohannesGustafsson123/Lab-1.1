import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vad heter du? ");
        String namn = scanner.nextLine();
        System.out.println("Hej " + namn + "!");
    }
}

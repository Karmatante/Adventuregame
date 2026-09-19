package se.iths.katharina.adventuregame;

public class ConsoleHelper {

    public static void printMenu() {
        IO.println("1. Utforska");
        IO.println("2. Vila");
        IO.println("3. Visa status");
        IO.println("4. Avsluta Äventyrsspelet");
        IO.println();
    }

    public static int readInt(String prompt) {
        boolean running = false;
        int choice = 0;
        do {
            String input = IO.readln(prompt);
            running = true;
            try {
                choice = Integer.parseInt(input);
                running = false;
                IO.println();
            } catch (NumberFormatException e) {
                ConsoleHelper.printMessage("FEL!", "Du måste skriva ett tal mellan 1 och 4.");
            }
        } while (running);
        return choice;
    }

    public static void printMessage(String title, String message) {
        IO.println(title);
        IO.println(message);
    }
}

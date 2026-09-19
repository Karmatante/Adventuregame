package se.iths.katharina.adventuregame;

public class Game {
    private Player player;

    public Game(Player player) {
        this.player = player;
    }

    public void startGame() {
        int choice = 0;

        while (choice != 4) {
            player.greetPlayer();
            ConsoleHelper.printMenu();
            choice = ConsoleHelper.readInt("Vad vill du göra, " + player.getName() + "?");

            switch (choice) {
                case 1:
                    player.explore();
                    break;

                case 2:
                    player.rest();
                    break;

                case 3:
                    player.showStatus();
                    break;

                case 4:
                    ConsoleHelper.printMessage("Du har valt att avsluta äventyrsspelet.", "Vi ses nästa gång.");
                    break;

                default:
                    ConsoleHelper.printMessage("Ooops! Det blev visst fel.", "Vänligen välj en siffra mellan 1 och 4.");
            }
        }

    }


}

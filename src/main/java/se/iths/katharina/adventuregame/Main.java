package se.iths.katharina.adventuregame;

public class Main {
    static void main() {

        Player player = new Player("Hattie", 100, 200);

        Game game1 = new Game(player);

        game1.startGame();

    }
}


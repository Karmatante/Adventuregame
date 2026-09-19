package se.iths.katharina.adventuregame;

public class Player {
    private String name;
    private int health;
    private int amountGold;

    public Player(String name, int health, int amountGold) {
        this.name = name;
        this.health = health;
        this.amountGold = amountGold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountGold() {
        return amountGold;
    }

    public int getHealth() {
        return health;
    }

    public void addHealth() {
        health += 20;

        if (health >= 100) {
            health = 100;
            IO.println("Du har full hälsa.");
        }
    }

    public void removeHealth() {
        health -= 15;
        if (health <= 0) {
            IO.println("Oooops, du behöver verkligen vila! Din hälsa är 0.");
            health = 0;
        }
    }

    public void addGold() {
        amountGold += 20;
    }

    public void greetPlayer() {
        IO.println("Välkommen,  " + getName());
    }

    public void explore() {
        ConsoleHelper.printMessage("Utforska", """
                Du lämnar stigen och går djupare in i skogen. Något glimmar mellan träden – du hittar guld, men äventyret kostar lite energi också.""");
        IO.println("Du får 20 mynt guld.");
        IO.println("Du tappar 15 hälsa.");
        addGold();
        removeHealth();
    }

    public void rest() {
        ConsoleHelper.printMessage("Vila", """
                Du hittar en lugn plats under ett stort träd och slår dig ner för att vila. Efter en stund känner du hur krafterna återvänder och din hälsa ökar.""");
        IO.println("Din hälsa ökar med 20.");
        addHealth();
    }

    public void showStatus() {
        ConsoleHelper.printMessage("Visa status", """
                Du stannar upp och ser över hur det går. Du kontrollerar din hälsa och räknar dina guldmynt innan du bestämmer vad du ska göra härnäst.""");
        IO.println("Din hälsa: " + health);
        IO.println("Din guld: " + amountGold);
        IO.println();
    }


}

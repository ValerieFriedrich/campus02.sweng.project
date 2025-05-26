package uno_katja;

import java.util.*;

public class UnoKonsoleSetup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> spielerNamen = new ArrayList<>();

        System.out.println("Willkommen bei UNO!");

        // 1. Namen eingeben
        for (int i = 1; i <= 4; i++) {
            System.out.print("Gib den Namen von Spieler " + i + " ein: ");
            String name = scanner.nextLine();
            spielerNamen.add(name);
        }

        // 2. Zufällige Startreihenfolge mischen
        Collections.shuffle(spielerNamen);

        System.out.println("\nZufällige Spielreihenfolge:");
        for (int i = 0; i < spielerNamen.size(); i++) {
            System.out.println((i + 1) + ". " + spielerNamen.get(i));
        }

        // 3. Wer beginnt?
        String startspieler = spielerNamen.get(0);
        System.out.println("\n" + startspieler + " beginnt das Spiel!\n");

        // Ab hier könntest du mit einer Runde starten

    }
}
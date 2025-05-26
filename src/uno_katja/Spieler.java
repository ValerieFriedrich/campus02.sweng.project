package uno_katja;

import java.util.ArrayList;

public class Spieler {
    private String name;

    // Die Hand des Spielers (Liste mit seinen Karten)
    private ArrayList<UnoKarte> hand = new ArrayList<>();

    public Spieler(String name) {
        this.name = name;
    }

    // Methode, um dem Spieler eine Karte zu geben (zb beim Ziehen)
    public void nimmKarte(UnoKarte karte) {
        hand.add(karte);
    }

    // Zeigt alle Karten, die der Spieler aktuell auf der Hand hat
    public void zeigeHand() {
        System.out.println(name + " hat folgende Karten:");
        for (UnoKarte k : hand) {
            System.out.println(" - " + k);
        }
    }

    // Gibt den Namen des Spielers zurück
    public String getName() {
        return name;
    }
}

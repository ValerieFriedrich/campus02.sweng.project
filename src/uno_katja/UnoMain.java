package uno_katja;

public class UnoMain {
    public static void main(String[] args) {
        UnoKarte karte1 = new UnoKarte(UnoKarte.Farbe.ROT, UnoKarte.Wert.DREI);
        UnoKarte karte2 = new UnoKarte(UnoKarte.Farbe.BLAU, UnoKarte.Wert.PLUSZWEI);

        Spieler s1 = new Spieler("Ekaterina");
        s1.nimmKarte(karte1);
        s1.nimmKarte(karte2);
        s1.zeigeHand();
    }
}

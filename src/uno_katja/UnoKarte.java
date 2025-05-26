package uno_katja;


public class UnoKarte {
    public enum Farbe {
        ROT,
        BLAU,
        GELB,
        GRUEN,
        SCHWARZ
    }

    public enum Wert {
        NULL,
        EINS,
        ZWEI,
        DREI,
        VIER,
        FUENF,
        SECHS,
        SIEBEN,
        ACHT,
        NEUN,
        AUSSETZEN,
        RICHTUNGSWECHSEL,
        PLUSZWEI,
        JOKER,
        JOKER_PLUSVIER
    }

    private Farbe farbe;
    private Wert wert;

    public UnoKarte(Farbe farbe, Wert wert) {
        this.farbe = farbe;
        this.wert = wert;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public Wert getWert() {
        return wert;
    }

    @Override
    public String toString() {
        return farbe + " " + wert;
    }
}

package ba.unsa.etf.rpr;

public class Predmet {

    public enum TipPredmeta {IZBORNI, OBAVEZNI};
    private int ects;
    private String studenti, naziv;
    private int semestar;
    private TipPredmeta tip;


    Predmet(String naziv, TipPredmeta tip, int ects, int semestar) {
        //samo se postavljaju primljeni parametri u novokreirani objekat
    }



}

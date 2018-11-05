package ba.unsa.etf.rpr;

public class Student {
    private String imeprezime;
    private int index;
    private int semestar;
    private Predmet [] nizpredmeta= new Predmet[10];

    Student (String imeprezime, int semestar, int index, Predmet ... nizizbornih) {
        //pretrazuje niz predmeta iz klase Program  i dodaje svaki obavezni iz svog semestra u svoj niz.
        //provjerava je li suma ects-ova izbornih + obaveznih veca od 30, ako da, dodaje izborne kod sebe u niz
        // salje svakom predmetu u nizu string imeprezime i int index;
    }

    void UpisiNaredniSemestar (Predmet ... nizizbornih) {
        //azurira niz predmeta za naredni semestar
    }


}

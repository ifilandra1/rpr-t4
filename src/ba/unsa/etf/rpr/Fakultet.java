package ba.unsa.etf.rpr;


import java.util.Set;

public class Fakultet {
    Set<Student> studenti;
    Set<Predmet> predmeti;
    Set<Upis> upisani;

    void DodajStudenta(Student s) {
        studenti.add(s);
    }
    void DodajPredmet(Predmet p) {
        predmeti.add(p);
    }



    public static void main(String[] args) {
        //pravljenje instanci tipa student i predmet, pohranjivanje referenci na njih u atribute ove klase
    }
}

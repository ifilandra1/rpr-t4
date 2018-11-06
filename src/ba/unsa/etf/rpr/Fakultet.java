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
    void DodajUpis(Upis u) {
        upisani.add(u);
    }





}

package ba.unsa.etf.rpr;


import java.util.Iterator;
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


    void IspisiStudentaSaFakulteta(Student s){
        Iterator<Student> it =  studenti.iterator();
while(it.hasNext()){

    if(s.equals(it.next())) it.remove();
}
Iterator<Upis> it2=upisani.iterator();
while(it2.hasNext()) {
    if(s.equals(it2.next().getStudent())) it2.remove();
}
    }



}

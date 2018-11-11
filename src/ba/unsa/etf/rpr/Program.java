package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Program {


    public static void main(String[] args) {

        Fakultet f = new Fakultet();

        Student s1= new Student("Ibrahim Filandra", 18009);
        Student s2= new Student("Rijad Sehovic", 17777);
        Student s3= new Student("Ibrahim Alispahic", 17444);
        Predmet p1=new Predmet("im2", 7);
        Predmet p2= new Predmet ("lsau",6);
        Set<Predmet> set= new TreeSet<Predmet>();
        set.add( p1); set.add(p2);
        Map<Integer, Set<Predmet>> mapa = new HashMap<>();
        mapa.put(1,set);

        PlanStudija ae= new PlanStudija("automatika",mapa);
        f.DodajStudenta(s1); f.DodajStudenta(s2); f.DodajStudenta(s3);
        f.DodajPredmet(p1); f.DodajPredmet(p2);

        f.DodajUpis(new Upis(ae,s1,p1));
        f.DodajUpis(new Upis(ae,s1,p2));
        f.DodajUpis(new Upis(ae,s2,p2));
        f.DodajUpis(new Upis(ae,s2,p1));
        f.DodajUpis(new Upis(ae,s3,p2));
        f.DodajUpis(new Upis(ae,s3,p1));
          f.IspisiStudentaSaFakulteta(s2);


    }

}

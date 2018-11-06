package ba.unsa.etf.rpr;

import java.util.Map;
import java.util.Set;

public class PlanStudija {

    String naziv;
    Map<Integer, Set<Predmet>> mapa;

    public PlanStudija(String naziv, Map<Integer, Set<Predmet>> mapa) {
        this.naziv=naziv;
        this.mapa=mapa;
    }

}

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

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Map<Integer, Set<Predmet>> getMapa() {
        return mapa;
    }

    public void setMapa(Map<Integer, Set<Predmet>> mapa) {
        this.mapa = mapa;
    }
}

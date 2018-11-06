package ba.unsa.etf.rpr;

public class Predmet {


    String naziv;
    int ects;
    public Predmet(String naziv, int ects) {
        this.naziv=naziv; this.ects=ects;
    }
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }
}

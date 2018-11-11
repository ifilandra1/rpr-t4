package ba.unsa.etf.rpr;

public class Student {

    String imeprezime;
    int brindexa;
    public Student(String imeprezime, int brindexa) {
        this.imeprezime=imeprezime;
        this.brindexa=brindexa;
    }

    public String getImeprezime() {
        return imeprezime;
    }

    public void setImeprezime(String imeprezime) {
        this.imeprezime = imeprezime;
    }

    public int getBrindexa() {
        return brindexa;
    }

    public void setBrindexa(int brindexa) {
        this.brindexa = brindexa;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

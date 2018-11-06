package ba.unsa.etf.rpr;

public class Upis {


    PlanStudija plan;
    Student student;
    Predmet predmet;

    public Upis (PlanStudija plan, Student s, Predmet p) {
        this.plan=plan; this.student=s; this.predmet=p;
    }


    public PlanStudija getPlan() {
        return plan;
    }

    public void setPlan(PlanStudija plan) {
        this.plan = plan;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }
}

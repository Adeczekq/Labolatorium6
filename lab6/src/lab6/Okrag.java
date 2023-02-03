package lab6;

public class Okrag extends Figura {
    double promien;
    Punkt punkt;


    public Okrag() {
        punkt = new Punkt(0, 0);
        this.promien=2;
    }

    public Okrag(double promien, Punkt punkt) {
        this.promien = promien;
        this.punkt = punkt;
    }

    double getPowierzchnia()
    {
        return Math.PI*promien*promien;
    }
    double getSrednica(){
        return 2*promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }


}

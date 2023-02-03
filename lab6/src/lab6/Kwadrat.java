package lab6;

public class Kwadrat extends Prostokat
{
    double bok=5;

    public Kwadrat(double wys, double szer, double bok) {
        super(wys, szer);
        this.bok = bok;
    }

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }
}


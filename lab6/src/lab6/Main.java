package lab6;

public class Main {
    public static void main(String[] args) {
        Punkt pk1=new Punkt();
        Punkt pk2=new Punkt(3.0,1.5);
        Punkt pk3=new Punkt(4.0,-1.5);

      /*  System.out.println("Pkt1: ");
        pk1.setX(3.4);
        pk1.setY(0.5);
        pk1.opis();
        pk1.przesun(1,1);
        pk1.opis();

        System.out.println("Pkt2: ");
        pk2.opis();
        pk2.przesun(1,1);
        pk2.opis();

        System.out.println("Pkt3: ");
        pk3.opis();
        pk3.przesun(1,1);
        pk3.opis();*/


        /*Figura f1=new Figura();
        System.out.println(f1.opis());
        Trojkat t1=new Trojkat(5,8);
        Prostokat p1=new Prostokat(5,7);
        System.out.println(p1.getPowierzchnia());*/

        Okrag o1=new Okrag();
        System.out.println(o1.getPowierzchnia());
        System.out.println(o1.getSrednica());

        Prostokat p=new Prostokat(10,5);
        p.przesun(3,5);


    }
}

//Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea()
// che stampi l'area della forma.
// Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea()
// per calcolare l'area del rettangolo.

package Ereditarieta2;

public class Rettangolo extends Forma {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        double area = base * altezza;
        return area;
        //System.out.print ("Valore area del rettangolo " +  calcolaArea );
    }
}

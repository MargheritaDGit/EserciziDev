// Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso() per miagolare.
// Prova quindi a far stampare il verso di Animale e di Gatto.

public class Gatto extends Animale {

    @Override
    public void faIlVerso() {
        System.out.print("Gatto fa il verso miao");
    }
}

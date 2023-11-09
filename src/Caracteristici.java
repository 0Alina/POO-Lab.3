 public class Caracteristici extends Carte {
    int numarVolume;

    public Caracteristici(String denumire, String autor, int numarVolume) {
        super(denumire, autor);
        this.numarVolume = numarVolume;
    }
    public void afiseazaDetaliiCaracteristici() {
        System.out.println("Numărul de volume: " + numarVolume) ;
    }
}

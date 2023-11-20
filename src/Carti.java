public class Carti {
    private int nrPagini;
    private String copertare;

    public void recenzie() {
        System.out.println("Recenzie necunoscută");
    }

    public Carti(int nrPagini, String copertare){
        this.nrPagini = nrPagini;
        this.copertare = copertare;
    }
    public void afisareDetalii(){
        System.out.println("Numărul de pagini: " + nrPagini);
        System.out.println("Copertare: " + copertare);
    }
}

 public class Carte {
        String denumire;
        String autor;

        public Carte(String denumire, String autor) {
            this.denumire = denumire;
            this.autor = autor;
        }
        public void afiseazaDetalii() {
            System.out.println("Denumire: " +denumire) ;
            System.out.println("Autor: " +autor) ;
        }
}
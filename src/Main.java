public class Main {
    public static void main(String[] args) {
        Caracteristici caracteristici = new Caracteristici("Casa Nopții","Kristin Cast",12);

        caracteristici.afiseazaDetalii();
        caracteristici.afiseazaDetaliiCaracteristici();

        Fantasy fantasy = new Fantasy(345, "Solidă", "grad1");
        fantasy.setNrRaft(5);

        System.out.println("\nDetalii cărți fantasy:");
        fantasy.afisareDetalii();
        fantasy.afisareDetaliiFantasy();
        fantasy.recenzie();

        Drama drama = new Drama(289, "Mobilă", "grad4");
        drama.setNrRaft(3);

        System.out.println("\nDetalii cărți drama:");
        drama.afisareDetalii();
        drama.afisareDetaliiDrama();
        drama.recenzie();

        Thriller thriller = new Thriller(196, "Solidă", "grad2");
        thriller.setNrRaft(1);

        System.out.println("\nDetalii cărți thriller:");
        thriller.afisareDetalii();
        thriller.afisareDetaliiThriller();
        thriller.recenzie();
    }
}
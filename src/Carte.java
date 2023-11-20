//supraclasă
public class Carte {
    String denumire;
    String autor;

    public Carte(String denumire, String autor) {
        this.denumire = denumire;
        this.autor = autor;
    }public void afiseazaDetalii() {
        System.out.println("Denumire: " + denumire) ;
        System.out.println("Autor: " + autor) ;
    }

    //POLIMORFISM STATIC
    public static String indiceVolum(int a, String b){
         return a + b;
    }
    public static String indiceVolum(int a, String b, int c){
        return a + b + c;
    }
    public static String indiceVolum(int a, String b, int d, int e){
        return a + b + d + e;
    }
}
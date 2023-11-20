public class Thriller extends Carti implements Raft{
    private String gradT;
    private int nrRaft;

    public Thriller(int nrPagini, String copertare, String gradT) {
        super(nrPagini, copertare);
        this.gradT = gradT;
    }
    @Override
    public void setNrRaft(int nrRaft) {
        this.nrRaft = nrRaft;
    }
    @Override
    public int getNrRaft() {
        return nrRaft;
    }
    @Override
    public void recenzie() {
        System.out.println("Recenzie: 9/10");
    }
    public void afisareDetaliiThriller() {
        System.out.println("Gradul Thriller: " + gradT);
        System.out.println("Numarul Raftului: " + nrRaft);
    }
}

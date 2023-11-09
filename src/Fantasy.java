public class Fantasy extends Carti implements Raft{
    private String gradF;
    private int nrRaft;

    public Fantasy(int nrPagini, String copertare, String gradF) {
        super(nrPagini, copertare);
        this.gradF = gradF;
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
    void recenzie() {
        System.out.println("Recenzie: 3/10");
    }
    public void afisareDetaliiFantasy() {
        System.out.println("Gradul Fantasy: " + gradF);
        System.out.println("Numarul Raftului: " + nrRaft);
    }
}

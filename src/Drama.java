public class Drama extends Carti implements Raft {
    private String gradD;
    private int nrRaft;

    public Drama(int nrPagini, String copertare, String gradD) {
        super(nrPagini, copertare);
        this.gradD = gradD;
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
        System.out.println("Recenzie: 6/10");
    }
    public void afisareDetaliiDrama() {
        System.out.println("Gradul Drama: " + gradD);
        System.out.println("Numarul Raftului: " + nrRaft);
    }
}

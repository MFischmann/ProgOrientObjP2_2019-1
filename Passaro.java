public class Passaro extends Animal implements Protegido{
    private boolean voa;
    private int nroLicensaIBAMA;
    private int anoLicenciamento;

    public Passaro(int id, String nome, float peso, boolean pet, boolean voa, int licensa, int ano){
        super(id, nome, peso, pet);
        this.voa = voa;
        this.nroLicensaIBAMA = licensa;
        this.anoLicenciamento = ano;
    }

    @Override
    public int getAnoLicenciamento() {
        return anoLicenciamento;
    }

    @Override
    public int getNroLicensaIBAMA() {
        return nroLicensaIBAMA;
    }

    public boolean podeVoar(){
        return voa;
    }
}
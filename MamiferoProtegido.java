public class MamiferoProtegido extends Mamifero implements Protegido{
    private int anoLicenciamento;
    private int nroLicensaIBAMA;

    public MamiferoProtegido(int id, String nome, float peso, boolean pet,
             boolean carnivoro, boolean herbivoro, int anoLicenciamento, int nroLicensaIBAMA)
            throws PesoInvalidoException {
        super(id, nome, peso, pet, carnivoro, herbivoro);
        this.anoLicenciamento = anoLicenciamento;
        this.nroLicensaIBAMA = nroLicensaIBAMA;
    }

    @Override
    public int getAnoLicenciamento() {
        return anoLicenciamento;
    }

    @Override
    public int getNroLicensaIBAMA() {
        return nroLicensaIBAMA;
    }
}
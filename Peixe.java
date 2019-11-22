public class Peixe extends Animal{
    private boolean aguaSalgada;
    private boolean aguaDoce;

    public Peixe(int id, String nome, float peso, boolean pet, boolean aguaDoce) throws PesoInvalidoException {
        super(id, nome, peso, pet);
        this.aguaDoce = aguaDoce;
        this.aguaSalgada = !aguaDoce;
    }

    public boolean isAguaDoce(){
        return aguaDoce;
    }

    public boolean isAguaSalgada(){
        return aguaSalgada;
    }

    @Override
    public String toString() {
        String s = super.toString();
        if(aguaDoce){
            s=s+", eh de agua doce";
        }
        else{
            s=s+", eh de agua salgada";
        }
        return s;
    }
}
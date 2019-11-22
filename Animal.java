public class Animal {
  
    private String nome;
    private float peso;
    private boolean pet;
    private int id;
  
    public Animal(int id,String nome,float peso,boolean pet) throws PesoInvalidoException {
        if(peso < 0){
            throw new PesoInvalidoException("Peso nao pode ser negativo");
        }
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.pet = pet;
    }
  
    public int getId() { return id; }
    public String getNome() { return nome; }
    public float getPeso() { return peso; }
    public boolean isPet() {  return pet; }
  
    public boolean mesmaCategoria(Animal outro){
      if (Math.abs(this.getPeso() - outro.getPeso())>5){
        return false;
      }else{
        return true;
      }
    }
  
    public String toString(){
      String str = getNome()+", "+getPeso()+"kgs";
      if (isPet() == true){
        str = str + ", eh um pet";
      }
      return str;
    }
  }
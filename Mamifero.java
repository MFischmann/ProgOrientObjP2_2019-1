public class Mamifero extends Animal{
    private boolean carnivoro;
    private boolean herbivoro;
    private boolean onivoro;

    public Mamifero(int id, String nome, float peso, boolean pet, boolean carnivoro, boolean herbivoro){
        super(id, nome, peso, pet);
        this.carnivoro = carnivoro;
        this.herbivoro = herbivoro;
        if(carnivoro&&herbivoro){
            this.onivoro = true;
        }
    }

    public boolean isCarnivoro(){
        return carnivoro;
    }

    public boolean isHerbivoro(){
        return herbivoro;
    }

    public boolean isOnivoro(){
        return onivoro;
    }
}
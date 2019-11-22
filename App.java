import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App{
    public static void main(String[] args){
        try {
            List<Protegido> lstP = new ArrayList<>();
            
            lstP.add(new Passaro(1, "Tucano", 5, false, true, 1000, 1993));
            lstP.add(new Passaro(2, "Pinguin", 20, false, false, 2890, 1960));
            lstP.add(new MamiferoProtegido(3, "Tamandua", 15, false, true, false, 2000, 30));
            System.out.println(countPassaroProt(lstP));
            Peixe p1 = new Peixe(14, "Beta", 0.1f, true, true);
            Peixe p2 = new Peixe(16, "Dourado", 0.15f, true, true);
            Mamifero m1 = new Mamifero(56, "Calico", 1.2f, true, true, false);
            Mamifero m2 = new Mamifero(33, "Coelho", 2, true, false, true);
            Mamifero m3 = new Mamifero(27, "Pastor Alemao", 4, true, true, false);
            Animal a = new Animal(33, "Tarantula", 0.3f, true);
            Set<Animal> lojaA = new HashSet<>();
            Set<Animal> lojaB = new HashSet<>();
            lojaA.add(p1);
            lojaA.add(m2);
            lojaA.add(m3);
            lojaA.add(a);
            lojaB.add(p2);
            lojaB.add(a);
            lojaB.add(m3);
            lojaB.add(m1);
            lojaB.add(p1);

            Set<Animal> repetidos = animaisDuplicados(lojaA, lojaB);
            for (Animal animal : repetidos) {
                System.out.println(animal);
            }
        } 
        catch (PesoInvalidoException e) {
            System.out.println("Animal nao pode ter peso negativo.");
        }

    }

    public static long countPassaroProt(List<Protegido> lst){
        return lst.stream().filter(p -> p instanceof Passaro).count();
    }

    public static Set<Animal> animaisDuplicados(Set<Animal> a, Set<Animal> b){
        Set<Animal> dupAnimais = new HashSet<>();
        for (Animal animal : a) {
            if(b.contains(animal)){
                dupAnimais.add(animal);
            }
        }
        return dupAnimais;
    }
}
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App{
    public static void main(String[] args){
        try {
            List<Protegido> lstP = new ArrayList<>();
            Passaro ps1 = new Passaro(1, "Tucano", 5, false, true, 1000, 1993);
            lstP.add(ps1);
            Passaro ps2 = new Passaro(2, "Pinguin", 20, false, false, 2890, 1960);
            lstP.add(ps2);
            MamiferoProtegido mp1 = new MamiferoProtegido(3, "Tamandua", 15, false, true, false, 2000, 30);
            lstP.add(mp1);
            MamiferoProtegido mp2 = new MamiferoProtegido(90, "Rinoceronte", 300, false, false, true, 1980, 92801);
            lstP.add(mp2);
            System.out.println("Q2");
            System.out.println(countPassaroProt(lstP));
            Peixe p1 = new Peixe(14, "Beta", 0.1f, true, true);
            Peixe p2 = new Peixe(16, "Dourado", 0.15f, true, true);
            Mamifero m1 = new Mamifero(56, "Calico", 1.2f, true, true, false);
            Mamifero m2 = new Mamifero(33, "Coelho", 2, true, false, true);
            Mamifero m3 = new Mamifero(27, "Pastor Alemao", 55, true, true, false);
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
            List<Animal> lista = new ArrayList<>();
            lista.add(p1);
            lista.add(p2);
            lista.add(m1);
            lista.add(m2);
            lista.add(m3);
            lista.add(a);
            lista.add(ps1);
            lista.add(ps2);
            lista.add(mp1);
            lista.add(mp2);
            Passaro ps3 = new Passaro(77, "Avestruz", 240, false, false, 32435, 2008);
            lista.add(ps3);
            System.out.println("Q4");
            Set<Animal> repetidos = animaisDuplicados(lojaA, lojaB);
            for (Animal animal : repetidos) {
                System.out.println(animal);
            }

            System.out.println("Q5");
            maisCinquenta(lista);

            System.out.println("Q6");

        } 
        catch (PesoInvalidoException e) {
            System.out.println("Animal nao pode ter peso negativo.");
        }

    }
    /**
     * Q2
     * @param lst
     * @return nrm passaros
     */
    public static long countPassaroProt(List<Protegido> lst){
        return lst.stream().filter(p -> p instanceof Passaro).count();
    }
    /**
     * Q4
     * @param a conjunto 1
     * @param b conjunto 2
     * @return interseccao conjuntos
     */
    public static Set<Animal> animaisDuplicados(Set<Animal> a, Set<Animal> b){
        Set<Animal> dupAnimais = new HashSet<>();
        for (Animal animal : a) {
            if(b.contains(animal)){
                dupAnimais.add(animal);
            }
        }
        return dupAnimais;
    }
    /**
     * Q5
     * @param lst lista animais
     */
    public static void maisCinquenta(List<Animal> lst){
        lst.stream().filter(a -> a.getPeso()>50).forEach(a->System.out.println(a.getNome()));
    }

}
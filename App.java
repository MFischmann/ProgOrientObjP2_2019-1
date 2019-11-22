import java.util.ArrayList;
import java.util.List;

public class App{
    public static void main(String[] args){
        try {
            List<Protegido> lstP = new ArrayList<>();
            
            lstP.add(new Passaro(1, "Tucano", 5, false, true, 1000, 1993));
            lstP.add(new Passaro(2, "Pinguin", 20, false, false, 2890, 1960));
            lstP.add(new MamiferoProtegido(3, "Tamandua", 15, false, true, false, 2000, 30));
            Peixe p = new Peixe(12, "Sardinha", -2, false, false);
            System.out.println(countPassaroProt(lstP));
        } 
        catch (PesoInvalidoException e) {
            System.out.println("Animal nao pode ter peso negativo.");
        }

    }

    public static long countPassaroProt(List<Protegido> lst){
        return lst.stream().filter(p -> p instanceof Passaro).count();
    }
}
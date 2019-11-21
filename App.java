import java.util.ArrayList;
import java.util.List;

public class App{
    public static void main(String[] args) {
    List<Protegido> lstP = new ArrayList<>();
    lstP.add(new Passaro(1, "Tucano", 5, false, true, 1000, 1993));
    lstP.add(new Passaro(2, "Pinguin", 20, false, false, 2890, 1960));
    lstP.add(new MamiferoProtegido(3, "Tamandua", 15, false, true, false, 2000, 30));
    System.out.println(countPassaroProt(lstP));
    }

    public static long countPassaroProt(List<Protegido> lst){
        return lst.stream().filter(p -> p instanceof Passaro).count();
    }
}
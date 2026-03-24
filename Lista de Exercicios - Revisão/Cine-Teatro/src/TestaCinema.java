import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        Filme f1 = new Filme(1, "Batman", "Ficção", 190);
        Filme f2 = new Filme(2, "Duna", "Ficção", 160);

        Sessao sala1 = new Sessao(1, LocalDateTime.of(2026, 03, 25, 20,0,0), 1, f1);
        sala1.venderIngresso(1, "14B", "inteira", 35);
        sala1.venderIngresso(2, "15C", "meia", 17.5);
        sala1.venderIngresso(3, "17J", "inteira", 35);

        System.out.println(sala1);
    }
}

import java.time.LocalDateTime;
import java.util.Date;
import java.util.prefs.PreferenceChangeEvent;

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente(1, "Lucas", "56823497542");
        Medico m1 = new Medico(1, "Paulo", "Ortopedia");
        Consulta c1 = new Consulta(LocalDateTime.of(2026, 05, 20, 8, 0, 0), 500.0, m1, p1);

        System.out.println(c1);
    }
}

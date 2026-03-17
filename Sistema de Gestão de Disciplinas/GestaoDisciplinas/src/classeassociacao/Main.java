package classeassociacao;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Voo voo1 = new Voo(1, "Brasil", "EUA", LocalDateTime.of(2026, Month.DECEMBER, 5, 20, 0, 0));

        Passageiro passageiro1 = new Passageiro("123456", "João Panetone");

        System.out.println(voo1.getData());

        Reserva reserva1 = new Reserva(1, LocalDateTime.now(), 55, passageiro1, voo1);

        System.out.println(reserva1);
        System.out.println(reserva1.getData());
    }
}

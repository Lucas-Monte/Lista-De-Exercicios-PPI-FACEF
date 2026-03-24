import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime data;
    private int sala;
    private Filme filme;
    private ArrayList<Ingresso> ingressos;


    public Sessao(int id, LocalDateTime data, int sala, Filme filme) {
        this.id = id;
        this.data = data;
        this.sala = sala;
        this.filme = filme;
        this.ingressos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "id=" + id +
                ", data=" + data +
                ", sala=" + sala +
                ", filme=" + filme +
                ", ingressos=" + ingressos +
                '}';
    }

    public void vincularFilme(Filme filme) {
        this.filme = filme;
    }

    public void venderIngresso(int id, String assento, String tipo, double preco) {
        Ingresso ingresso = new Ingresso(id, assento, tipo, preco);
        this.ingressos.add(ingresso);
    }
}

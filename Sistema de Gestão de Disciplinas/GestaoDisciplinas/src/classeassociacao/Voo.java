package classeassociacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voo implements DataFormatoBr{
    private int numero;
    private String origem;
    private String destino;
    private LocalDateTime data;

    public Voo(int numero, String origem, String destino, LocalDateTime data) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public Voo(){}

    @Override
    public String toString() {
        DateTimeFormatter formato = formatoBr();

        return "Voo{" +
                "numero=" + numero +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", data=" + data.format(formato) +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        DateTimeFormatter formato = formatoBr();
        return data.format(formato);
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public DateTimeFormatter formatoBr() {
        DateTimeFormatter formatoCerto = DateTimeFormatter.ofPattern("dd/MM/yyyy 'as' HH'h'mm");
        return formatoCerto;
    }
}

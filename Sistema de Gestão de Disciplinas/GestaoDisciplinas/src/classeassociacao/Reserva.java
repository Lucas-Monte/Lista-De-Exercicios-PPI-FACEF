package classeassociacao;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva implements DataFormatoBr {
    private int codigo;
    private LocalDateTime data;
    private int poltrona;
    //associação
    private Passageiro passageiro;
    private Voo voo;

    public Reserva(int codigo, LocalDateTime data, int poltrona, Passageiro passageiro, Voo voo) {
        this.codigo = codigo;
        this.data = data;
        this.poltrona = poltrona;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public Reserva() {
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = formatoBr();
        return "Reserva{" +
                "codigo=" + codigo +
                ", data=" + data.format(formato) +
                ", poltrona=" + poltrona +
                ", passageiro=" + passageiro +
                ", voo=" + voo +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        DateTimeFormatter formato = formatoBr();
        return data.format(formato);
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public DateTimeFormatter formatoBr() {
        DateTimeFormatter formatoCerto = DateTimeFormatter.ofPattern("dd/MM/yyyy 'as' HH'h'mm");
        return formatoCerto;
    }
}

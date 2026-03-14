public class Questao {
    private int numero;
    private String enunciado;
    private double valor;

    public Questao(int numero, String enunciado, double valor) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.valor = valor;
    }

    public Questao() {
    }

    @Override
    public String toString() {
        return "Questao{" +
                "numero=" + numero +
                ", enunciado='" + enunciado + '\'' +
                ", valor=" + valor +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

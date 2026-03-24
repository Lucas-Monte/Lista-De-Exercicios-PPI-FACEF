public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador(int id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    public void setProcessador(String marca, String modelo, int frequencia) {
        Processador aux = new Processador(marca, modelo, frequencia);
        this.processador = aux;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", processador=" + processador +
                '}';
    }

    public Processador getProcessador() {
        return processador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

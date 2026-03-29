public class Veiculo {
    protected String marca;
    protected String modelo;
    protected float velocidade;


    public Veiculo(String marca, String modelo, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    public void mover(){
        System.out.println("Veículo se movendo...");
    }

    public void abastecer() {
        System.out.println("Veículo reabastecendo...");
    }

}

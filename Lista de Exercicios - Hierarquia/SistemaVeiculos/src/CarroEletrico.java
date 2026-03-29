public class CarroEletrico extends Veiculo{
    private int autonomiaBateria;

    public CarroEletrico(String marca, String modelo, float velocidade, int autonomiaBateria) {
        super(marca, modelo, velocidade);
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public String toString() {
        return "CarroEletrico{" +
                "autonomiaBateria=" + autonomiaBateria +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    @Override
    public void mover(){
        System.out.println("Carro elétrico movendo-se silenciosamente");
    }

    @Override
    public void abastecer() {
        System.out.println("Recarregando bateria em posto de carga rápida");
    }
}

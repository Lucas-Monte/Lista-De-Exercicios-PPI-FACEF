public class Aviao extends Veiculo{
    private float altitudeMax;

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "altitudeMax=" + altitudeMax +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    @Override
    public void mover(){
        System.out.println("Avião voando a " + this.velocidade + " km/h e " + this.altitudeMax + " metros");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação");
    }


}

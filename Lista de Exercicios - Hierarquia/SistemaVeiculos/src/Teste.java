public class Teste {
    public static void main(String[] args) {
        Veiculo v1 = new Aviao("Boing", "777", 700, 5000);

        v1.mover();

        v1 = new CarroEletrico("Tesla", "CyberTruck", 60, 55);

        v1.mover();
    }
}

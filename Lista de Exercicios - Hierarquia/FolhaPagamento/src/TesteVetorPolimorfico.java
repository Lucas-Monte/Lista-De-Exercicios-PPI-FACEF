import java.util.ArrayList;

public class TesteVetorPolimorfico {
    public static void main(String[] args) {
        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = new Junior("Pedro", "Lucas", "java", 2500);
        devs[1] = new Pleno("Joao", "c#", 4500, 5);
        devs[2] = new Senior("Pedro", "Java", 9750, 6000);
        devs[3] = new Desenvolvedor("Marcio", "Pyton", 5500);

        for (Desenvolvedor dev : devs) {
            dev.codar();
            System.out.println("Calculo de bonus = " + dev.calculaBonus());
            System.out.println(dev + "\n");
        }


    }
}

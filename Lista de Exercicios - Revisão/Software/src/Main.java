public class Main {
    public static void main(String[] args) {
        Programador p1 = new Programador(1, "Lucas", "Java");
        Programador p2 = new Programador(2, "Pedro", "Java");
        Programador p3 = new Programador(3, "João", "Java");

        Projeto proj1 = new Projeto(1, "Projeto1");
        proj1.adicionarProgramador(p1);
        proj1.adicionarProgramador(p2);
        proj1.adicionarProgramador(p3);

        System.out.println(proj1.mostrarProgramadores());
    }
}

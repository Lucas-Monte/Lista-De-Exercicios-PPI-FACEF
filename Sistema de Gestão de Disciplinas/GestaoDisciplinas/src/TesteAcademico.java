public class TesteAcademico {
    public static void main(String args[]) {
        Aluno aluno1 = new Aluno(1, "Lucas", 25993, "Engenharia de Software");
        Aluno aluno2 = new Aluno(2, "Ana Laura", 25996, "Engenharia de Software");

        Disciplina disciplina = new Disciplina(1, "Programação Orientada a Objetos", "Daniel");
        disciplina.matricularAluno(aluno1);
        disciplina.matricularAluno(aluno2);
        disciplina.criarAvaliacao(1, "Prova Semestral");
        disciplina.getAvaliacoes().get(0).adicionarQuestao(1, "O que é POO?", 2.0);
        disciplina.getAvaliacoes().get(0).adicionarQuestao(2, "Qual o conceito de encapsulamento?", 3.0);
        disciplina.getAvaliacoes().get(0).adicionarQuestao(3, "Como funciona o método Todo-Parte?", 5.0);

        System.out.println(disciplina);
    }
}

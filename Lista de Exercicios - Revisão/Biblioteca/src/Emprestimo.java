import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucaoPrevista;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime dataDevolucaoPrevista, Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.leitor = leitor;
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "dataEmprestimo=" + this.getDataEmprestimo() +
                ", dataDevolucaoPrevista=" + this.getDataDevolucaoPrevista()     +
                ", leitor=" + leitor +
                ", livro=" + livro +
                '}';
    }

    public String getDataEmprestimo() {
        DateTimeFormatter formatoBr = formatter();
        return dataEmprestimo.format(formatoBr);
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucaoPrevista() {
        DateTimeFormatter formatoBr = formatter();
        return dataDevolucaoPrevista.format(formatoBr);
    }

    public void setDataDevolucaoPrevista(LocalDateTime dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    private DateTimeFormatter formatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/HH/yyyy");
        return formatter;
    }
}

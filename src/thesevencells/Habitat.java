package thesevencells;


public class Habitat {
    
    private String nome;
    private int localizacao;
    private int qntrecursos;
    private int dificuldade;

    public Habitat(String nome, int localizacao, int qntrecursos, int dificuldade) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.qntrecursos = qntrecursos;
        this.dificuldade = dificuldade;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }

    public int getQntrecursos() {
        return qntrecursos;
    }

    public void setQntrecursos(int qntrecursos) {
        this.qntrecursos = qntrecursos;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
    
    
}

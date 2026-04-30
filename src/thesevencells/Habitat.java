package thesevencells;

public class Habitat {

    private String nome;
    private int localizacao;
    private double qntrecursosTotal;
    private double qntrecursosAtual;
    private int dificuldade;

    public Habitat(String nome, int localizacao, double qntrecursos, int dificuldade) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.qntrecursosTotal = qntrecursos;
        this.qntrecursosAtual = qntrecursos;
        this.dificuldade = dificuldade;
    }

    public void gerirRecurso(double entrada) {
        if (entrada < 0) {
            setQntrecursosAtual(getQntrecursosAtual() + entrada);
        }
        if (entrada >= 0) {
            setQntrecursosAtual(getQntrecursosAtual() + (entrada));
        }
    }

    public String informações() {
        String info = ("\nNome: " + getNome() + " Recurso: " + getQntrecursosAtual());
        return info;
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

    public double getQntrecursosTotal() {
        return qntrecursosTotal;
    }

    public void setQntrecursosTotal(double qntrecursosTotal) {
        this.qntrecursosTotal = qntrecursosTotal;
    }

    public double getQntrecursosAtual() {
        return qntrecursosAtual;
    }

    public void setQntrecursosAtual(double qntrecursosAtual) {
        this.qntrecursosAtual = qntrecursosAtual;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

}
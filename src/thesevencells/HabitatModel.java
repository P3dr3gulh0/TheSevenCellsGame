package thesevencells;

public class HabitatModel {

    private String nome;
    private int idHabitat;
    private int tamanho;
    private double qntrecursosTotal;
    private double qntrecursosAtual;
    private int dificuldade;
    private int qntCriaturas;

    public HabitatModel(String nome, int localizacao, int tamanho, double qntrecursosTotal, int dificuldade) {
        this.nome = nome;
        this.idHabitat = localizacao;
        this.tamanho = tamanho;
        this.qntrecursosTotal = qntrecursosTotal;
        this.qntrecursosAtual = qntrecursosTotal;
        this.dificuldade = dificuldade;
    }

    public void gerarRecurso() {
        if (getQntrecursosAtual() < getQntrecursosTotal()) {
            setQntrecursosAtual(getQntrecursosAtual() + (getTamanho() / getDificuldade()));
            System.out.println("Habitat " + getNome() + "Gerou um recurso!");
            limitarRecursos();
        } else {
            System.out.println("Habitat " + getNome() + "Chegou ao limite de recursos!");
        }
    }

    public void perderRecurso(int valor) {
        if (getQntrecursosAtual() > 0) {
            
            setQntrecursosAtual(getQntrecursosAtual() - valor);
            
            System.out.println("Habitat " + getNome() + " Perdeu " + valor + " recurso(s)!");
            
            limitarRecursos();
        } else {
            
            System.out.println("Habitat sem recursos!");
        }
    }

    public void limitarRecursos() {
        if (getQntrecursosAtual() > getQntrecursosTotal()) {
            setQntrecursosAtual(getQntrecursosTotal());
        }
        if (getQntrecursosAtual() < 0) {
            setQntrecursosAtual(0);
        }
    }

    public String informações() {
        String info = ("\nNome: " + getNome() + "\nRecurso: " + getQntrecursosAtual());
        return info;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdHabitat() {
        return idHabitat;
    }

    public void setIdHabitat(int idHabitat) {
        this.idHabitat = idHabitat;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
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

    public int getQntCriaturas() {
        return qntCriaturas;
    }

    public void setQntCriaturas(int qntCriaturas) {
        this.qntCriaturas = qntCriaturas;
    }
}

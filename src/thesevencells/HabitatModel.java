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
        this.dificuldade = dificuldade;
    }

    public void gerarRecurso() {
        setQntrecursosAtual(getQntrecursosAtual() + 1);
        System.out.println("Habitat " + getNome() + "Gerou um recurso");
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

    public int getIdHabitat() {
        return idHabitat;
    }

    public void setIdHabitat(int idHabitat) {
        this.idHabitat = idHabitat;
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
package thesevencells;

import javax.swing.JOptionPane;

public class Mundo {

    private int dia;
    private HabitatModel habitat1;
    private CriaturaModel criatura1;
    private String relatorioCriatura = "";
    private String relatoriohabitat = "";
    
    relatorioCriatura = getCriatura1().informacoes();
    relatoriohabitat = getHabitat1().informacoes();
    public void gerar(HabitatModel habitat1, CriaturaModel criatura1) {
        setCriatura1(criatura1);
        setHabitat1(habitat1);
    }

    public void alimentarCriatura() {
        double valor = 1;
        if (!getCriatura1().isVivo()) {
            setRelatorioCriatura(getRelatorioCriatura() + "\n Dia " + getDia() + "Criatura morreu!");
            return;
        }
        if (getCriatura1().getEnergiaAtual() == getCriatura1().getEnergiaTotal()) {
            return;
        }

        if (receberRecurso(valor) == 0) {
            setRelatoriohabitat(getRelatoriohabitat() + "\n Dia " + getDia() + " Habitat sem recursos!");
            return;
        }

        getCriatura1().comer(valor);
        setRelatoriohabitat(getRelatoriohabitat() + "\n Dia " + getDia() + " Habitat Perdeu " + valor + " recursos");
        setRelatorioCriatura(getRelatorioCriatura() + "\n Dia " + getDia() + " Criatura comeu!");
    }

    public double receberRecurso(double valor) {
        setRelatoriohabitat(getRelatoriohabitat() + "\n Dia " + getDia() + " Habitat Perdeu " + valor + " recursos");

        return getHabitat1().fornecerRecursos(valor);
    }

    public void testes() {
//        getHabitat1().fornecerRecursos(2);
    }

    public void relatorio() {

        JOptionPane.showMessageDialog(null, getRelatorioCriatura());
        JOptionPane.showMessageDialog(null, getRelatoriohabitat());
    }

    public void contagemDia() {
        setDia(getDia() + 1);

        getCriatura1().perderEnergia(getHabitat1().getDificuldade());

    }

    public Mundo() {
    }

    public Mundo(int dia) {
        this.dia = dia;
    }

    public static HabitatModel gerarHabitats(String nome, int localizacao, int tamanho, double qntrecursos, int dificuldade) {
        HabitatModel habitat = new HabitatModel(nome, localizacao, tamanho, qntrecursos, dificuldade);
        return habitat;
    }

    public static CriaturaModel gerarCriaturas(String nome, int vidaTotal, int energiaTotal) {
        CriaturaModel cria = new CriaturaModel(nome, vidaTotal, energiaTotal);
        return cria;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public HabitatModel getHabitat1() {
        return habitat1;
    }

    public void setHabitat1(HabitatModel habitat1) {
        this.habitat1 = habitat1;
    }



    public CriaturaModel getCriatura1() {
        return criatura1;
    }

    public void setCriatura1(CriaturaModel criatura1) {
        this.criatura1 = criatura1;
    }

    public String getRelatorioCriatura() {
        return relatorioCriatura;
    }

    public void setRelatorioCriatura(String relatorioCriatura) {
        this.relatorioCriatura = relatorioCriatura;
    }

    public String getRelatoriohabitat() {
        return relatoriohabitat;
    }

    public void setRelatoriohabitat(String relatoriohabitat) {
        this.relatoriohabitat = relatoriohabitat;
    }

}

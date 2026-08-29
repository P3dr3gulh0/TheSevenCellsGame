package thesevencells;

import java.util.ArrayList;

public class Mundo {

    private int dia;
    private HabitatModel Habitat1;
    private CriaturaModel criatura1;

    public void gerar(HabitatModel habitat1, CriaturaModel criatura1) {
        setCriatura1(criatura1);
        setHabitat1(habitat1);
        System.out.println(getHabitat1().getNome());
        System.out.println(getCriatura1().getNome());
    }

    public void alimentarCriatura() {
        int valor = 1;
        if (getCriatura1().isVivo()) {
            if (getHabitat1().getQntrecursosAtual() > valor) {
                getCriatura1().comer(valor);
                getHabitat1().perderRecurso(valor);
                return;
            }
            getCriatura1().perderEnergia(valor);
        }
    }
    public void contagemDia() {
        setDia(getDia() + 1);
        System.out.println(getHabitat1().informações());
        System.out.println(getCriatura1().informações());
        System.out.println("Dia: " + getDia());

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
        return Habitat1;
    }

    public void setHabitat1(HabitatModel Habitat1) {
        this.Habitat1 = Habitat1;
    }

    public CriaturaModel getCriatura1() {
        return criatura1;
    }

    public void setCriatura1(CriaturaModel criatura1) {
        this.criatura1 = criatura1;
    }

}
//
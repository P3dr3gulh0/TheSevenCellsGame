package thesevencells;

import java.util.ArrayList;

public class Mundo {

    private int dia;
    private HabitatModel Habitat1;
    private CriaturaModel criatura1;

    public Mundo() {
    }

    public Mundo(int dia) {
        this.dia = dia;
    }
    
    public void contagemDia(){
        setDia(getDia()+ 1);
        
        System.out.println("Dia: " + getDia());
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
    
   

    
}

package thesevencells;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TheSevenCells {

    public static void main(String[] args) {


        int cont = 1;
        while (true) {
            existencia(cont, gerarHabitats("Selva", 1, 10, 2), gerarCriaturas(nome, habitat, cont, cont));
            cont++;
        }

    }

    public static void existencia(int dias, ArrayList habitat, ArrayList criaturas) {

        for (Criaturas criatura : criaturas) {

            criatura.mover();

            if (criatura.getEnergiaAtual() < criatura.getEnergiaTotal() * 0.4) {
                criatura.comer();
            }

            if (criatura.getEnergiaAtual() < criatura.getEnergiaTotal() * 0.2) {
                criatura.dano();
            }

            habitat1.gerirRecurso(0.5);

            JOptionPane.showMessageDialog(null, criatura.informações(), dias + "° Dia", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, habitat1.informações(), dias + "° Dia", JOptionPane.PLAIN_MESSAGE);

            if (criatura.getVidaAtual() < 1) {
                System.exit(0);
            }
        }
    }

    public static ArrayList gerarHabitats(String nome, int localizacao, double qntrecursos, int dificuldade) {
        ArrayList<Habitat> habitats = new ArrayList();
        
        Habitat habitat = new Habitat(nome, localizacao, qntrecursos, dificuldade);
        
        habitats.add(habitat);
        
        return habitats;
    }

    public static ArrayList gerarCriaturas(String nome, int vidaTotal,int energiaTotal) {
        ArrayList<Criatura> criaturas = new ArrayList();
        
        Criatura cria = new Criatura(nome, vidaTotal, energiaTotal);
        criaturas.add(cria);
        return criaturas;
    }
}

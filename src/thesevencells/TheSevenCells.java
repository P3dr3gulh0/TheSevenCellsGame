package thesevencells;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TheSevenCells {

    public static void main(String[] args) {
        
        int cont = 1;
        while (true) {
            existencia(cont);
            cont++;
        }

    }

    public static void existencia(int dias) {
        
        ArrayList<Criatura> criaturas = new ArrayList();
        
        Habitat habitat1 = new Habitat("Selva", 1, 10, 2);

        Criatura criatura1 = new Criatura("Archea", habitat1, 10, 10);
        Criatura criatura2 = new Criatura("Soluns", habitat1, 15, 5);
        
        criaturas.add(criatura1);
        criaturas.add(criatura2);
        for(Criatura criatura: criaturas){
            
        criatura.mover();

        if (criatura.getEnergiaAtual() < criatura.getEnergiaTotal() * 0.4) {
            criatura.comer();
        }

        if (criatura.getEnergiaAtual() < criatura.getEnergiaTotal() * 0.2) {
            criatura.dano();
        }

        habitat1.gerirRecurso(0.5);
        
        JOptionPane.showMessageDialog(null, criatura.informações(), dias + "° Dia" , JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, habitat1.informações(), dias + "° Dia" , JOptionPane.PLAIN_MESSAGE);
        
        if (criatura.getVidaAtual() < 1) {
            System.exit(0);
        }
        }
    }
}

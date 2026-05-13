package thesevencells;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TheSevenCells {

    public static void main(String[] args) {

        int cont = 1;
        while (true) {
            existencia(cont, gerarHabitats("Selva", 1, 10, 2), gerarCriaturas("Archea", cont, cont));
            cont++;
        }

    }

    public static void existencia(int dias, ArrayList<Habitat> habitats, ArrayList<Criatura> criaturas) {

        for (Habitat habitat : habitats) {

            for (Criatura criatura : criaturas) {

                String mensagem = "";
                mensagem += "Dia um: ";
                mensagem += "Dados do habitat: "+habitat.informações()+"\n";
                mensagem += "Dados da Criatura: "+ criatura.informações();
                

                JOptionPane.showMessageDialog(null, mensagem);
            }
        }
    }

    public static ArrayList gerarHabitats(String nome, int localizacao, double qntrecursos, int dificuldade) {
        ArrayList<Habitat> habitats = new ArrayList();

        Habitat habitat = new Habitat(nome, localizacao, qntrecursos, dificuldade);

        habitats.add(habitat);

        return habitats;
    }

    public static ArrayList gerarCriaturas(String nome, int vidaTotal, int energiaTotal) {
        ArrayList<Criatura> criaturas = new ArrayList();

        Criatura cria = new Criatura(nome, vidaTotal, energiaTotal);
        criaturas.add(cria);
        return criaturas;
    }
}

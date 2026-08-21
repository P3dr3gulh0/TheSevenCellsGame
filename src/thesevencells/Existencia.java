package thesevencells;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Existencia {

    public static void main(String[] args) {

        Mundo mundo1 = new Mundo(0);
        int cont = 1;
        HabitatModel selva = gerarHabitats("Selva", 1, 10, 10, 2);
        gerarCriaturas("Archea", 10, 10);

        while (mundo1.getDia() < 5) {
            mundo1.contagemDia();
            selva.gerarRecurso();
        }
    }

    public static HabitatModel gerarHabitats(String nome, int localizacao, int tamanho, double qntrecursos, int dificuldade) {

        HabitatModel habitat = new HabitatModel(nome, localizacao, tamanho, qntrecursos, dificuldade);

        return habitat;
    }

    public static CriaturaModel gerarCriaturas(String nome, int vidaTotal, int energiaTotal) {

        CriaturaModel cria = new CriaturaModel(nome, vidaTotal, energiaTotal);

        return cria;
    }
}

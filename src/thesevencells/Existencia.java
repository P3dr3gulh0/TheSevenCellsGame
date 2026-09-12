package thesevencells;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Existencia {

    public static void main(String[] args) {
        Mundo mundo1 = new Mundo(0);
        CriaturaModel criatura1 = new CriaturaModel("Archea", 10, 10);
        HabitatModel habitat1 = new HabitatModel("Selva", 1, 10, 10, 2);

        mundo1.gerar(habitat1, criatura1);

        while (mundo1.getCriatura1().isVivo()) {
            mundo1.contagemDia();
            mundo1.alimentarCriatura();
            
        }
        mundo1.relatorio();
    }
}

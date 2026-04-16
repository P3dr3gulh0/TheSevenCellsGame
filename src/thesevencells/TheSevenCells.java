package thesevencells;

public class TheSevenCells {

    public static void main(String[] args) {

        Habitat habitat1 = new Habitat("Selva", 1, 10, 2);

        Criatura criatura1 = new Criatura("Archea", habitat1, 10, 10);

        criatura1.informações();
        criatura1.setEnergia(3);
        criatura1.informações();
        

    }

}

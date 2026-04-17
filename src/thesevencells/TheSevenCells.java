package thesevencells;

public class TheSevenCells {

    public static void main(String[] args) {

        Habitat habitat1 = new Habitat("Selva", 1, 10, 2);

        Criatura criatura1 = new Criatura("Archea", habitat1, 10, 10);

        while(criatura1.getVida()!=0){
            
            if (criatura1.getEnergia() < 4) {
                criatura1.comer();
            }

            criatura1.informações();
            criatura1.mover();
            criatura1.dano();
        }

    }
}

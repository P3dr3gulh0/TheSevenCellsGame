package thesevencells;

public class Criatura {

    private String nome;
    private Habitat habitat;
    private int vida;
    private int energia;

    public Criatura(String nome, Habitat habitat, int vida, int energia) {
        this.nome = nome;
        this.habitat = habitat;
        this.vida = vida;
        this.energia = energia;
    }

    public void comer() {
        int recurso = habitat.getQntrecursos();

        if (recurso > 0) {
            System.out.println("Comendo");
            habitat.setQntrecursos(habitat.getQntrecursos() - 1);
            setEnergia(getEnergia() + 1);
        }else{
            System.out.println("Sem comida por perto!");
        }
    }

    public void dano() {
        if (getEnergia() < getEnergia() * 0.1) {
            setVida(getVida()-1);
        }
    }

    public void mover() {
        int dificuldade = habitat.getDificuldade();
        
        if(getEnergia() < dificuldade){
            System.out.println("Pouca energia, sem possibilidade de movimento!");
        }else{
            System.out.println("Criatura se movendo!");
            setEnergia(getEnergia() - dificuldade);
        }
    }

    public void informações() {
        System.out.println("\nNome: " + getNome() + " \nVida: " + getVida() + "\nEnergia: " + getEnergia() + "\nHabitat: " + habitat.getNome());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public int getVida() {
        if (vida < 0) {
            setEnergia(0);
        }
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        if (energia < 0) {
            setEnergia(0);
        }
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

}

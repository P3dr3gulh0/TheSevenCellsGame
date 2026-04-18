package thesevencells;

public class Criatura {

    private String nome;
    private Habitat habitat;
    private int vidaTotal;
    private int vidaAtual;
    private int energiaTotal;
    private int energiaAtual;
    public boolean vivo = true;

    public Criatura(String nome, Habitat habitat, int vidaTotal, int energiaTotal) {
        this.nome = nome;
        this.habitat = habitat;
        this.vidaTotal = vidaTotal;
        this.energiaTotal = energiaTotal;
    }



    public void viver() {
        
        if (getEnergiaAtual() <= (getEnergiaTotal() * 0.4)) {
            comer();
        }
        if (getEnergiaAtual() <= (getEnergiaTotal() * 0.2)) {
            dano();
        }
        mover();

    }

    public void comer() {
        int recurso = habitat.getQntrecursos();

        if (recurso > 0) {
            System.out.println("Comendo");
            habitat.setQntrecursos(habitat.getQntrecursos() - 1);
            setEnergiaAtual(getEnergiaAtual() + 1);
        } else {
            System.out.println("Sem comida por perto!");
        }
    }

    public void dano() {
        setVidaAtual(getVidaAtual() - 1);
        System.out.println("Tomou dano!");
    }

    public void mover() {
        int dificuldade = habitat.getDificuldade();

        if (getEnergiaAtual() < dificuldade) {
            System.out.println("Pouca energia, sem possibilidade de movimento!");
        } else {
            System.out.println("Criatura se movendo!");
            setEnergiaAtual(getEnergiaAtual() - dificuldade);
        }
    }

    public void informações() {
        System.out.println("\nNome: " + getNome() + " \nVida: " + getVidaAtual()+ "\nEnergia: " + getEnergiaAtual()+ "\nHabitat: " + habitat.getNome());
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

    public int getVidaTotal() {
        return vidaTotal;
    }

    public void setVidaTotal(int vidaTotal) {
        this.vidaTotal = vidaTotal;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public int getEnergiaTotal() {
        return energiaTotal;
    }

    public void setEnergiaTotal(int energiaTotal) {
        this.energiaTotal = energiaTotal;
    }

    public int getEnergiaAtual() {
        return energiaAtual;
    }

    public void setEnergiaAtual(int energiaAtual) {
        this.energiaAtual = energiaAtual;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}

 
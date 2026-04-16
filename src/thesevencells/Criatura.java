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
        
        if (recurso > 1) {
            System.out.println("Comendo");
            habitat.setQntrecursos(-1);
            this.energia = getEnergia()+1;
        }
    }

    public void dano() {
        if (getEnergia() < getEnergia() * (10 / 100)) {
            setVida(-1);
        }
    }

    public void mover() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Habitat gethabitat() {
        return habitat;
    }

    public void sethabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if(this.energia < (getEnergia()*0.4)){
            System.out.println("Ble.");
            comer();
        }else{
            this.energia = energia;
        }
    }

    public void informações() {
        System.out.println("\nNome: " + getNome() + " \nVida: " + getVida() + "\nEnergia: " + getEnergia() + "\nHabitat: " + habitat.getNome());
    }
}

package thesevencells;


public class Criatura {
    
    private String nome;
    private Habitat localizacao;
    private int vida;
    private int fome;
    private int energia;

    public Criatura(String nome, int vida, int fome, int energia) {
        this.nome = nome;
        this.vida = vida;
        this.fome = fome;
        this.energia = energia;
    }
    
    public void comer(int energia){
        
    }
    public void mover(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Habitat getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Habitat localizacao) {
        this.localizacao = localizacao;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
}


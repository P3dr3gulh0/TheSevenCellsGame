package thesevencells;

public class CriaturaModel {

    private String nome;
    private int vidaTotal;
    private int vidaAtual;
    private int energiaTotal;
    private int energiaAtual;
    private boolean vivo = true;

    public CriaturaModel(String nome, int vidaTotal, int energiaTotal) {
        this.nome = nome;
        this.vidaTotal = vidaTotal;
        this.vidaAtual = vidaTotal;
        this.energiaTotal = energiaTotal;
        this.energiaAtual = energiaTotal;
    }

    public void comer(int recurso) {

        if (recurso > 0) {
            System.out.println("Comendo");
            setEnergiaAtual(getEnergiaAtual() + recurso);
        } else {
            System.out.println("Sem comida por perto!");
        }
    }

    public void mover(int HabitatDificuldade) {

        if (getEnergiaAtual() > HabitatDificuldade) {
            System.out.println("Criatura se moveu!");
            setEnergiaAtual(getEnergiaAtual() - HabitatDificuldade);

        } else {
            System.out.println("A Criatura " + getNome() + " não tem energia para se mover");
        }
    }

    public String informações() {

        String info = ("\nNome: " + getNome() + " \nVida: " + getVidaAtual() + "\nEnergia: " + getEnergiaAtual());
        return info;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

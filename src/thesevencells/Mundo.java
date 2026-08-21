package thesevencells;

import java.util.ArrayList;

public class Mundo {

    private int dia;

    public Mundo() {
    }

    public Mundo(int dia) {
        this.dia = dia;
    }
    
    public void contagemDia(){
        setDia(getDia()+ 1);
        
        System.out.println("Dia: " + getDia());
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
   

    
}

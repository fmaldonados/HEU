
package heu;

import java.io.Serializable;


public class ambulancias implements Serializable{
    String placa,complejo;
    int año,max_km;
    
    public ambulancias() {
    }

    public ambulancias(String placa, String complejo, int año, int max_km) {
        this.placa = placa;
        this.complejo = complejo;
        this.año = año;
        this.max_km = max_km;
    }
    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMax_km() {
        return max_km;
    }

    public void setMax_km(int max_km) {
        this.max_km = max_km;
    }
    
    
}

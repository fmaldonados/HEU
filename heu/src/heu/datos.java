
package heu;

import java.io.Serializable;
import java.util.ArrayList;


public class datos implements Serializable{
    ArrayList<complejo_h> complejos = new ArrayList();
    ArrayList<paramedicos> paramedico = new ArrayList();
    ArrayList<ambulancias> ambulancia = new ArrayList();
    ArrayList<domicilio> domicilios = new ArrayList();

    public datos() {
    }

    public ArrayList<complejo_h> getComplejos() {
        return complejos;
    }

    public void setComplejos(ArrayList<complejo_h> complejos) {
        this.complejos = complejos;
    }

    public ArrayList<paramedicos> getParamedico() {
        return paramedico;
    }

    public void setParamedico(ArrayList<paramedicos> paramedico) {
        this.paramedico = paramedico;
    }

    public ArrayList<ambulancias> getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(ArrayList<ambulancias> ambulancia) {
        this.ambulancia = ambulancia;
    }

    public ArrayList<domicilio> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(ArrayList<domicilio> domicilios) {
        this.domicilios = domicilios;
    }
    
    
}

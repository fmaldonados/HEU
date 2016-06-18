
package heu;

import java.util.ArrayList;


public class complejo_h {
    String nombre,direccion;
    int capacidad_p,capacidad_a;
    char ranking; 
    ArrayList<ambulancias> ambulancias_h = new ArrayList();
    ArrayList<paramedicos> paramedicos_h = new ArrayList();

    public complejo_h() {
    }
    
    public complejo_h(String nombre, String direccion, int capacidad_p, int capacidad_a, char ranking) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad_p = capacidad_p;
        this.capacidad_a = capacidad_a;
        this.ranking = ranking;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad_p() {
        return capacidad_p;
    }

    public void setCapacidad_p(int capacidad_p) {
        this.capacidad_p = capacidad_p;
    }

    public int getCapacidad_a() {
        return capacidad_a;
    }

    public void setCapacidad_a(int capacidad_a) {
        this.capacidad_a = capacidad_a;
    }

    public char getRanking() {
        return ranking;
    }

    public void setRanking(char ranking) {
        this.ranking = ranking;
    }

    public ArrayList<ambulancias> getAmbulancias_h() {
        return ambulancias_h;
    }

    public void setAmbulancias_h(ArrayList<ambulancias> ambulancias_h) {
        this.ambulancias_h = ambulancias_h;
    }

    public ArrayList<paramedicos> getParamedicos_h() {
        return paramedicos_h;
    }

    public void setParamedicos_h(ArrayList<paramedicos> paramedicos_h) {
        this.paramedicos_h = paramedicos_h;
    }
    
    
}

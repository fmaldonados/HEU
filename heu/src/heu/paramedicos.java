
package heu;

import java.io.Serializable;


public class paramedicos implements Serializable, Comparable<paramedicos> {
    String nombre,ID;
    int edad;
    char ranking;
    String complejo;
    public paramedicos() {
    }

    public paramedicos(String nombre, String ID, int edad, char ranking, String complejo) {
        this.nombre = nombre;
        this.ID = ID;
        this.edad = edad;
        this.ranking = ranking;
        this.complejo = complejo;
    }

    public String getComplejo() {
        return complejo;
    }

    public void setComplejo(String complejo) {
        this.complejo = complejo;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getRanking() {
        return ranking;
    }

    public void setRanking(char ranking) {
        this.ranking = ranking;
    }

    @Override
    public int compareTo(paramedicos t) {
        char a,b;
        a = this.getRanking();
        b = t.getRanking();
        
        if (this.equals(t)) {
            return 0;
        }else{
            if (a>b) {
                return 1;
            }else{
                return -1;
            }
        }
    }
    
    
}

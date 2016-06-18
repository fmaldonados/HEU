
package heu;


public class paramedicos {
    String nombre,ID;
    int edad;
    char ranking;

    public paramedicos(String nombre, String ID, int edad, char ranking) {
        this.nombre = nombre;
        this.ID = ID;
        this.edad = edad;
        this.ranking = ranking;
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
    
    
}

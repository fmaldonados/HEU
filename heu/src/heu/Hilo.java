
package heu;

import javax.swing.JOptionPane;


public class Hilo extends Thread{
    double tiempo;
    String domicilio;
    boolean vive;

    public Hilo(double tiempo, String domicilio, boolean vive) {
        this.tiempo = tiempo;
        this.domicilio = domicilio;
        this.vive = vive;
    }
    
    @Override
    public void run(){
        try {
            this.verify(tiempo);
            JOptionPane.showMessageDialog(null, "Emergencia Terminada!");
            this.setVive(false);
        } catch (Exception e) {
        }
    }
    
    private void verify(double segundos){
        try {
            Thread.sleep((long)(segundos*1000));
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    
    }
    public void setVive(boolean Vive){
        this.vive = Vive;
    }
}

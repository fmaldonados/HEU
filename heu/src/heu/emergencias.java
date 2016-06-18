package heu;


public class emergencias {
    String lugar;
    char Ranking;

    public emergencias() {
    }
    
    public emergencias(String lugar, char Ranking) {
        this.lugar = lugar;
        this.Ranking = Ranking;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public char getRanking() {
        return Ranking;
    }

    public void setRanking(char Ranking) {
        this.Ranking = Ranking;
    }
    
    
}

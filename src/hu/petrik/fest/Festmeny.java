package hu.petrik.fest;

import java.time.LocalDateTime;

public class Festmeny {
    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzama;
    private LocalDateTime utolsoLicitIdeje;
    private int magasLicit;
    private Boolean elkelt;

    public Festmeny(String cim, String festo, String stilus, int licitekSzama, LocalDateTime utolsoLicitIdeje, int magasLicit, Boolean elkelt) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
        this.licitekSzama = licitekSzama;
        this.utolsoLicitIdeje = LocalDateTime.now();
        this.magasLicit = magasLicit;
        this.elkelt = elkelt;
    }

    public String getFesto() {
        return festo;
    }

    public String getStilus() {
        return stilus;
    }

    public int getLicitekSzama() {
        return licitekSzama;
    }

    public LocalDateTime getUtolsoLicitIdeje() {
        return utolsoLicitIdeje;
    }

    public int getMagasLicit() {
        return magasLicit;
    }

    public Boolean getElkelt() {
        return elkelt;
    }

    public void setElkelt(Boolean elkelt) {
        this.elkelt = elkelt;
    }

    public void licit(){
        if(elkelt){
            System.out.println("Ez a festmény már elkelt");
        }
        else if(this.licitekSzama == 0){
            this.magasLicit = 100;
            this.licitekSzama = 1;
            this.utolsoLicitIdeje = LocalDateTime.now();
        }
        else if(this.licitekSzama > 0){
            this.magasLicit = (int) (magasLicit * 1.1);
            this.licitekSzama = licitekSzama + 1;
            this.utolsoLicitIdeje = LocalDateTime.now();
        }
    }

    public int licit(int szam){
        if (szam > 9 && szam < 101){
            this.magasLicit = (int) (magasLicit * szam);
        }
        else{
            System.out.println("Hibás adat");
        }
        return magasLicit;
    }

    @Override
    public String toString() {
        return "Festmeny{" +
                "cim='" + cim + '\'' +
                ", festo='" + festo + '\'' +
                ", stilus='" + stilus + '\'' +
                ", licitekSzama=" + licitekSzama +
                ", utolsoLicitIdeje=" + utolsoLicitIdeje +
                ", magasLicit=" + magasLicit +
                ", elkelt=" + elkelt +
                '}';
    }
}

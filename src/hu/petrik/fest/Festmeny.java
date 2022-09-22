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

package hu.petrik.fest;

import java.time.LocalDateTime;
import java.util.List;

public class Festmeny {

    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzama;
    private int magasLicit;
    private LocalDateTime utolsoLicitIdeje;
    private boolean elkelt;

    public Festmeny(String cim, String festo, String stilus) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
        this.licitekSzama = 0;
        this.magasLicit = 0;
        this.elkelt = false;
    }

    public String getCim() {
        return cim;
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

    public int getMagasLicit() {
        return magasLicit;
    }

    public LocalDateTime getUtolsoLicitIdeje() {
        return utolsoLicitIdeje;
    }

    public boolean isElkelt() {
        return elkelt;
    }

    public void setElkelt(boolean elkelt) {
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
        } else{
            int ujlicit = (int)(this.magasLicit * 1.1);
            String szovegesLicit = String.valueOf(ujlicit);
            StringBuilder veglegesLicit = new StringBuilder(szovegesLicit.substring(0, 2));
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
        String elkelte = "";
        if(elkelt == true){
            elkelte = "elkelt";
            return festo + ":" + cim + "(" + stilus + ")\n" +
                    elkelte
                    + magasLicit + "$ - " + utolsoLicitIdeje + "(összesen: " + licitekSzama + " db";
        }
        else{
            elkelte = "nem kelt el";
            return festo + ":" + cim + "(" + stilus + ")\n" +
                    elkelte
                    + magasLicit + "$ - " + utolsoLicitIdeje + "(összesen: " + licitekSzama + " db";
        }
    }


}

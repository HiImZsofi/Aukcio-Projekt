package hu.petrik.fest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Festmenyek {

    private List<Festmenyek> listafestmenyek;

    private String cim;
    private String festo;
    private String stilus;


    public Festmenyek(String cim, String festo, String stilus) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
    }



}

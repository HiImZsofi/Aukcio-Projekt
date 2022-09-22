package hu.petrik.fest;

import java.io.*;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.lineSeparator;

public class Main {
    static List<Festmenyek> userfestmenyek;

    public static void main(String[] args) {
        Festmeny festmeny1 = new Festmeny("asd", "Van Gogh", "reneszansz", 0, LocalDateTime.now(),
                0, false);

        festmeny1.licit();
        System.out.println(festmeny1);

        userfestmenyek = new ArrayList<>();
        userfestmenyek.add(new Festmenyek("elso", "elsofesto", "stilus1"));
        userfestmenyek.add(new Festmenyek("masodik", "masodikfesto", "stilus2"));

        List<Festmeny> listafestmenyek = new ArrayList<>();

      /*  System.out.println("Adjon meg egy számot:");
        Scanner sc = new Scanner(in);
        int szam = Integer.parseInt(sc.nextLine());
        int probalkozas = 0;
        while (szam > probalkozas) {
            probalkozas++;
            System.out.println("A kép festője: ");
            String festo = sc.nextLine();
            System.out.println("A kép címe: ");
            String cim = sc.nextLine();
            System.out.println("A kép stílusa: ");
            String stilus = sc.nextLine();
            userfestmenyek.add(new Festmenyek(festo, cim, stilus));
            System.out.println("Successfully added");
        }*/

        File file = new File("festmenyek.csv");
        Scanner scR;
        try {
            scR = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (scR.hasNextLine()) {
            String[] temp = scR.nextLine().split(";");
            listafestmenyek.add(new Festmeny(temp[0], temp[1], temp[2]));
        }

        for (int i = 0; i < listafestmenyek.size(); i++) {
            try{
                System.out.print(listafestmenyek.get(i).toString());
            }catch (NullPointerException e){
                System.out.println(e);
            }
        }
        /*try {
            beolvas(fajlNev);
        } catch (FileNotFoundException e) {
            System.err.printf("Hiba miatt nem található az %s fájl\n", fajlNev);
        } catch (IOException e) {
            System.err.println("Ismeretlen hiba történt a fájl beolvasása során");
        }
        System.out.println(listafestmenyek);

        for (int i = 0; i < 20; i++) {
            listafestmenyek.get((int) (Math.random() * listafestmenyek.size())).licit((int) (Math.random() * 100) + 10);
        }*/


    }

    public static void beolvas(String fajlNev) {
        /*FileReader fr = new FileReader(fajlNev);
        BufferedReader br = new BufferedReader(fr);
        String sor = br.readLine();
        while (sor != null && !sor.equals("")) {
            String[] adatok = sor.split(";");
            Festmeny festmenySDAASDFASDAFES = new Festmeny(adatok[0], adatok[1], adatok[2]);
            listafestmenyek.add(festmenySDAASDFASDAFES);
            sor = br.readLine();
        }
        br.close();
        fr.close();*/



    }
}





package hu.petrik.fest;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.lineSeparator;

public class Main {
    static List<Festmeny> userfestmenyek;

    public static void main(String[] args) {
        Festmeny festmeny1 = new Festmeny("asd", "Van Gogh", "reneszansz");

        festmeny1.licit();
        System.out.println(festmeny1);

        userfestmenyek = new ArrayList<>();
        userfestmenyek.add(new Festmeny("elso", "elsofesto", "stilus1"));
        userfestmenyek.add(new Festmeny("masodik", "masodikfesto", "stilus2"));

        List<Festmeny> listafestmenyek = new ArrayList<>();

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

        for (int i = 0; i < 20; i++) {
            listafestmenyek.get((int) (Math.random() * listafestmenyek.size())).licit((int) (Math.random() * 100) + 10);
            System.out.println("licitek");
        }

        for (int i = 0; i < listafestmenyek.size(); i++) {
            try{
                System.out.print(listafestmenyek.get(i).toString());
            }catch (NullPointerException e){
                System.out.println(e);
            }

        }
        Scanner sc = new Scanner(in);
        int usorszam = -1;
        while(usorszam > listafestmenyek.size() || usorszam <= 0){

            System.out.println("Sorszám: ");
            usorszam = Integer.parseInt(sc.nextLine());
        }
        String mertek = null;
        while (mertek != null){
            System.out.println("Milyen mértékkel szeretne licitálni: ");
            mertek = (sc.nextLine());
            usorszam += 1;
            if(mertek.isEmpty() || mertek == null){
                listafestmenyek.get(usorszam - 1).licit();
            }
            else{
                listafestmenyek.get(usorszam - 1).licit(Integer.parseInt(mertek));
            }
        }

        for (int i = 0; i < listafestmenyek.size(); i++) {
            if(listafestmenyek.get(i).getLicitekSzama() > 0){
                listafestmenyek.get(i).setElkelt(true);
            }
        }

        for (int i = 0; i < listafestmenyek.size(); i++) {
            System.out.println(listafestmenyek.get(i).toString());
        }

        int legnagyobb = 0;
        int index = 0;
        for (int i = 0; i < listafestmenyek.size(); i++) {
            if (listafestmenyek.get(i).getMagasLicit() > legnagyobb){
                legnagyobb += listafestmenyek.get(i).getMagasLicit();
                index = i;
            }
        }
        System.out.println(listafestmenyek.get(index).toString());

        for (int i = 0; i < listafestmenyek.size(); i++) {
            if (listafestmenyek.get(i).getLicitekSzama() > 10){
                System.out.println(listafestmenyek.get(i).toString());
            }
        }

        int nemkeltel = 0;
        for (int i = 0; i < listafestmenyek.size(); i++) {
            if (!listafestmenyek.get(i).isElkelt()){
                nemkeltel++;
            }
        }
        System.out.printf("Összesen %d festmény nem kelt el", nemkeltel);

        Collections.reverse(listafestmenyek);
        Collections.sort(listafestmenyek, Collections.reverseOrder());
        for (int i = 0; i < listafestmenyek.size(); i++) {
            System.out.println(listafestmenyek.get(i).toString());
        }


    }
}





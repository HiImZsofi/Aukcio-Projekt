package hu.petrik.fest;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    static List<Festmenyek> festmenyek;
    public static void main(String[] args) {
        Festmeny festmeny1 = new Festmeny("asd", "Van Gogh", "reneszansz", 0, LocalDateTime.now(),
                0, false);

        festmeny1.licit();
        System.out.println(festmeny1);

        festmenyek = new ArrayList<>();
        festmenyek.add(new Festmenyek("elso", "elsofesto", "stilus1"));
        festmenyek.add(new Festmenyek("masodik", "masodikfesto", "stilus2"));

        System.out.println("Adjon meg egy számot:");
        Scanner sc = new Scanner(in);
        int szam = Integer.parseInt(sc.nextLine());
        int probalkozas = 0;
        while(szam > probalkozas){
            probalkozas++;
            System.out.println("A kép festője: ");
            String festo = sc.nextLine();
            System.out.println("A kép címe: ");
            String cim = sc.nextLine();
            System.out.println("A kép stílusa: ");
            String stilus = sc.nextLine();
            festmenyek.add(new Festmenyek(festo, cim, stilus));
            System.out.println("Successfully added");
        }


    }
}

package hu.petrik.fest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    }
}

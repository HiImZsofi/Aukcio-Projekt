package hu.petrik.fest;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Festmeny festmeny1 = new Festmeny("asd", "Van Gogh", "reneszansz", 0, LocalDateTime.now(),
                0, false);

        festmeny1.licit();
        System.out.println(festmeny1);
    }
}

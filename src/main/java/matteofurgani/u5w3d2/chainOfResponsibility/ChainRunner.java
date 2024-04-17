package matteofurgani.u5w3d2.chainOfResponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println(" ");
        System.out.println("ESERCIZIO 3 - Chain of Responsibility");
        System.out.println(" ");
        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();

        tenente.setResponsabile(capitano);
        capitano.setResponsabile(maggiore);
        maggiore.setResponsabile(colonnello);
        colonnello.setResponsabile(generale);

        int[] stipendio = {500, 1500, 2500, 3500, 4500, 5500};
        for (int importo : stipendio){
            System.out.println("Stipendio: " + importo);
            tenente.gestisciStipendio(importo);
            System.out.println();
        }

    }
}

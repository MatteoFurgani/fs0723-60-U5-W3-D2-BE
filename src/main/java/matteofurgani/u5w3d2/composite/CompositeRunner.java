package matteofurgani.u5w3d2.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompositeRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println(" ");
        System.out.println("ESERCIZIO 2 - Composite");
        System.out.println(" ");
        Pagina pagina1 = new Pagina(1);
        Pagina pagina2 = new Pagina(2);
        Pagina pagina3 = new Pagina(3);
        Pagina pagina4 = new Pagina(4);


        Sezione sezione1 = new Sezione("sezione1");
        sezione1.addElemento(pagina1);
        sezione1.addElemento(pagina2);

        Sezione sezione2 = new Sezione("sezione2");
        sezione2.addElemento(pagina3);
        sezione2.addElemento(pagina4);

        Libro libro = new Libro("libro", List.of("Mario Rossi", "Luigi Bianchi", "Giovanni Rossi"),35);
        libro.addElemento(sezione1);
        libro.addElemento(sezione2);

        libro.stampa();
        System.out.println("Pagine totali: " + libro.pagineTotali());
    }
}

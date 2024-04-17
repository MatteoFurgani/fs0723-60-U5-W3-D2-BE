package matteofurgani.u5w3d2.composite;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Libro implements ElementoContenuto {

    private String titolo;
    private List<String> autori;
    private double prezzo;
    private List<ElementoContenuto> elementi;

    public Libro(String titolo, List<String> autori, double prezzo) {
        this.titolo = titolo;
        this.autori = autori;
        this.prezzo = prezzo;
        this.elementi = new ArrayList<>();
    }

    public void addElemento(ElementoContenuto elemento) {
        elementi.add(elemento);
    }


    @Override
    public void stampa() {
        System.out.println("Stampa libro: " + titolo);
        for (ElementoContenuto elemento : elementi) {
            elemento.stampa();
        }

    }

    @Override
    public int pagineTotali() {
        int pagine = 0;
        for (ElementoContenuto elemento : elementi) {
            pagine += elemento.pagineTotali();
        }
        return pagine;
    }
}

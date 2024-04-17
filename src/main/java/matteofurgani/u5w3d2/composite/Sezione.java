package matteofurgani.u5w3d2.composite;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Sezione implements ElementoContenuto{

    private String nome;
    private List<ElementoContenuto> elementi = new ArrayList<>();

    public Sezione(String sezione1) {
        this.nome = nome;
    }


    public void addElemento(ElementoContenuto elemento) {
        elementi.add(elemento);
    }

    @Override
    public void stampa() {
        System.out.println("Stampa sezione: " + nome);
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

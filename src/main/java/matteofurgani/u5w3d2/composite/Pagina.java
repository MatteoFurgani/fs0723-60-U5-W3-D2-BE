package matteofurgani.u5w3d2.composite;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pagina implements ElementoContenuto {
    private int numeroPagina;

    @Override
    public void stampa() {
        System.out.println("Stampo la pagina numero " + numeroPagina);
    }

    @Override
    public int pagineTotali() {
        return 1;
    }
}

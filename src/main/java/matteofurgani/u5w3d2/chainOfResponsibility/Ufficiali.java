package matteofurgani.u5w3d2.chainOfResponsibility;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class Ufficiali implements Ufficiale {

    private Ufficiale responsabile;
    private int stipendio;

    public Ufficiali(int stipendio) {
        this.stipendio = stipendio;
    }

    public void setResponsabile(Ufficiale responsabile) {
        this.responsabile = responsabile;
    }

    @Override
    public void gestisciStipendio(int importo) {
        if (importo <= stipendio) {
            System.out.println(getClass().getSimpleName() + " ha gestito l'importo di " + importo);
        } else if (responsabile != null) {
            responsabile.gestisciStipendio(importo);
        } else {
            System.out.println("Nessun ufficiale disponibile per gestire l'importo di " + importo);
        }
    }
}

package matteofurgani.u5w3d2.adapter;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class InfoAdapter implements DataSource{

    private Info info;

    @Override
    public String getNomeCompleto() {

        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        // Calcoliamo l'età dalla data di nascita
        Date now = new Date();
        long differenza = now.getTime() - info.getDataDiNascita().getTime();
        long anni = 1000L * 60 * 60 * 24 * 365;
        return (int) (differenza / anni);
    }
}

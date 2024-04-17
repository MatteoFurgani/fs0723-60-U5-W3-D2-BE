package matteofurgani.u5w3d2.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AdapterRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println(" ");
        System.out.println("ESERCIZIO 1 - Adapter");
        System.out.println(" ");
        Info info = new Info();
        info.setNome("Matteo");
        info.setCognome("Furgani");
        info.setDataDiNascita(new Date(1991 - 1900, 0, 5));

        DataSource adapter = new InfoAdapter(info);
        UserData userData = new UserData();
        userData.getData(adapter);

        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());


    }
}

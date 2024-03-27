package Obiect;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ObiectTest {

    @Test
    public void metodaTest(){

        List<String> dotariExterioareAudi = Arrays.asList("faruri LED", "oglinzi electrice", "camera video");
        Audi AudiA1 = new Audi("Audi", "A1", "verde",
                "benzina", 2024, 1990, 10000, dotariExterioareAudi);
        AudiA1.prezentareAudi();
        AudiA1.definireImpozit();
        AudiA1.getPret();
        AudiA1.setCuloare("gri");
        AudiA1.pornesteMasina();


        List<String> dotariInteriorMazda = Arrays.asList("incalzire scaune", "HUD", "senzori adormire");
        List<String> doratiIExteriorMazda = Arrays.asList("faruri LED", "camera trafic");

        Mazda Mazda3 = new Mazda("Mazda", "3", "neagra",
                "benzina", 2016, 1998, 20000, dotariInteriorMazda, doratiIExteriorMazda);

        System.out.println(" ");

//        Mazda.prezentareMasina();
//        Mazda.culoare="Rosie";
//        Mazda.prezentareMasina();
//        Mazda.definireImpozit();
//        System.out.println();

        Mazda3.prezentareMazda();
        Mazda3.definireImpozit();
        Mazda3.pornesteMasina();
        System.out.println(" ");
        Mazda3.afisarePret();
        Mazda3.afisarePret(50);
        Mazda3.afisarePret("Craciun");
        

//
//        Masina AstonMartin = new Masina("Aston Martin", "Vantage", "gri",
//                "benzina", 2019, 3500);
//        AstonMartin.prezentareMasina();
//        AstonMartin.definireImpozit();
//        System.out.println();
//
//        Masina Dacia = new Masina("Dacia", "Duster", "neagra",
//                "benzina", 2024, 1500, 24000);
//        Dacia.definireImpozit();
//        Dacia.prezentareMasina();
    }
}
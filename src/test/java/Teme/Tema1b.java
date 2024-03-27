package Teme;

import org.testng.annotations.Test;

public class Tema1b {


//    public String producator;
//    public String model;
//    public Integer capacitatePersoane;
//    public Double capacitateCilindrica;
//    public Character parteVolan;
//    public Boolean produsUE;


    @Test
    public void metodaAfisare(){


        prezentareAuto("Dacia", "Duster", 5, 1.500, 'S', true);
        prezentareAuto("Mini", "Cooper", 5, 1.800, 'D', false);
        prezentareAuto("Mazda", "3", 5, 1.988, 'S', false);
        prezentareAuto("Aston Martin", "Vantage", 2, 4.000, 'D', false);
    }

    public void prezentareAuto(String producator, String model, Integer capacitatePersoane,
                               Double capacitateCilindrica, Character parteVolan, Boolean produsUE) {

        System.out.println("Producator: " + producator);
        System.out.println("Model: " + model);
        System.out.println("Nr. max. persoane: " + capacitatePersoane);
        System.out.println("Capacitate motor (cc): " + capacitateCilindrica);
        System.out.println("Parte volan: " + parteVolan);
        System.out.println("Model produs in UE: " + produsUE);
    }
}

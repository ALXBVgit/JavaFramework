package Teme;

import org.testng.annotations.Test;

public class Tema1a {

    //tema : de afisat 4 masini diferite

    public String producator;
    public String model;
    public Integer capacitatePersoane;
    public Double capacitateCilindrica;
    public Character parteVolan;
    public Boolean produsUE;

@Test
    public void metodaAfisare() {

        producator="Dacia";
        model="Duster";
        capacitatePersoane=5;
        capacitateCilindrica=1.500;
        parteVolan='S';
        produsUE=true;

        System.out.println("Producator: "+producator);
        System.out.println("Model: "+model);
        System.out.println("Nr. max. persoane: "+capacitatePersoane);
        System.out.println("Capacitate motor (cc): "+capacitateCilindrica);
        System.out.println("Parte volan: "+parteVolan);
        System.out.println("Model produs in UE: "+produsUE);

    }



}

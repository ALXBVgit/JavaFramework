package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {
    //structuri alternative = if... then ... else / switch... case

    @Test
    public void metodaTest(){
//        numarmaiMareCaX(11);
//        numarmaiMareCaX(10);
//        numarmaiMareCaX(8);
//
//        numarParPozitiv(10);
//        numarParPozitiv(-10);
//        numarParPozitiv(7);
//        numarParPozitiv(2);
//        numarParPozitiv(-6);
//        propozitie("Ana are mere,", "Ana", "mere");
//        propozitie("Ana are mere,", "Ana", "gutui");
//        propozitie("Ana are mere,", "ana", "gutui");

        zileSaptamana(5);
    }

    //verificam daca un nr este mai mare decat 10
    public void numarmaiMareCaX(Integer input){
        if (input>10) {
            System.out.println("Numarul " + input + " este mai made decat 10");
        }
        else if (input==10) {
            System.out.println("Numarul "+input+ " este egal cu 10");
        }
        else {
            System.out.println("Numarul "+input+" este mai mic decat 10");
        }
    }

    //verificam daca un numar este par si pozitiv
    public void numarParPozitiv(Integer x) {
        if (x%2==0){
            if (x>=0){
                System.out.println("Numarul "+x+" este par si pozitiv");
            }
            else {
                System.out.println("Numarul "+x+" este par si negativ");
            }
        }
        else {
            if (x<0){
                System.out.println("Numarul "+x+" este impar si negativ");
            }
            else {
                System.out.println("Numarul "+x+" este impar si pozitiv");
            }
        }
    }



    //verificam ca o propozitie contine 2 cuvinte
    //Ana are mere => caut Ana si mere
    public void propozitie(String propozitie, String cuvant1, String cuvant2){
        if (!(propozitie.contains(cuvant1) && propozitie.contains(cuvant2))){
            System.out.println("Adevarat");
        }
        else {
            System.out.println("Fals");
        }
    }

    //reprezentam cazuril pentru zilele saptamanii
    public void zileSaptamana(Integer zi){
        switch (zi){
            case 1:
                System.out.println("Azi este luni");
                break;
            case 2:
                System.out.println("Azi este marti");
                break;
            case 3:
                System.out.println("Azi este miercuri");
                break;
            default:
                System.out.println("Selectie zi invalida");
        }
    }
}

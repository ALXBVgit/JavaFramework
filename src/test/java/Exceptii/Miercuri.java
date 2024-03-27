package Exceptii;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Miercuri {

    //exceptie = eroare care apare in momentul cand programul ruleaza
    //exceptiile trebuie tratate deoarece contin informatii care pot sa fie exploatate
    //ex: citim continutul unui fisier care nu exista -> filenotfoundexception
    //ex: citim datele dintr-un tabel din baza de date -> sqlexception
    //ca sa tratam o exceptie, ne folosim de constructia: try ... catch ... finally
    //exista 2 tipuri de exceptii: checked si unchecked
    //checked -> exceptii care se trateaza in timpul compilarii
    //unchecked -> exceptii care nu se trateaza in timpul compilarii
    //exista 2 cuvinte cheie pentru tratarea exceptiilor: throw si throws
    //throw -> este folosit sa arunce o exceptie anume (explicit)
    //throw -> este regasit in interiorul unei metode
    //throws -> este folosit in semnatura metodei ca sa declare ca o metoda poate arunca o exceptie


    @Test
    public void testMethod() throws FileNotFoundException {
        incarcaFisier();
//        afisareCursanti();
//        cumparEnergizant();
        incarcaFisierV2();
    }

    public void incarcaFisier(){
        try {
            File file = new File("adresa/resursa/fisier");
            FileInputStream fileInputStream = new FileInputStream(file);
        }
        catch (FileNotFoundException exception){
            System.out.println("Nu exista fisierul");

        }
        finally {
            System.out.println("A intrat pe finally indiferent daca a cazut sau nu");
        }
    }

    public void afisareCursanti(){

        String [] Cursanti = new String[2];

        Cursanti[0]="Bogdan";
        Cursanti[1]="Ioana";
        Cursanti[2]="Alex";

        for (int i=0; i<Cursanti.length; i++){
            System.out.println(Cursanti[i]);
        }
    }

    public void cumparEnergizant(){
        Integer varsta=15;
        if (varsta<=18){
            throw new RuntimeException("Persoana este minora");
        }
    }

    public void incarcaFisierV2() throws FileNotFoundException {
        File file = new File("adresa/resursa/fisier");
        FileInputStream fileInputStream = new FileInputStream(file);
    }

}

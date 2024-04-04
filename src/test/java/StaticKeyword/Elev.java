package StaticKeyword;

public class Elev {

    //static = reprezinta o alta modalitate prin care putem face share la o variabila / metoda dintr-o clasa
    //putem considera ca fiind o proprietate comuna pentru toate obiectele

    public String nume;
    public String prenume;
    public String scoala="Mihai Eminescu";

    public static Integer nrElevi=0;

    public Elev(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public void prezentare(){
        System.out.println("Numele este: "+ nume);
        System.out.println("Prenumele este: "+prenume);
        System.out.println("Scoala este: "+scoala);
        nrElevi++;
        System.out.println(nrElevi);
    }
}

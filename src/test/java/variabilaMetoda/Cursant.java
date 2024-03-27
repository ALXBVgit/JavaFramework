package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {
    // acesta este un comentariu
    //clasa = sablon specific unui anumit obiect/produs
    //o clasa trebuie sa contina un nume
    //recunoastem o clasa intr-un fisier java dupa cuvantul class
    //intr-un fisier java putem avea mai multe clase (nu este good practice)
    //variabila = proprietatea/atributul unei clase
    //intr-o clasa putem avea mai mule variabile
    //exista 2 tipuri de variabile: global si local
    //variabila globala=vizibila peste tot in acest fisier
    //variabila locala=vizibila doar in locul unde este definita
    //pentru inceput, toate variabilele globale sunt publice
    //diferenta intre global si local o face access controll ("public")
    //tipuri de date: String, Integer, Double (64 bit), Float (32 bit), Character, Boolean
    //nu este oblogatoriu ca o variabila sa primeasca o valoare cand o definim


    public String nume;
    public String prenume;
    public Integer varsta;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;


    //metoda = actiunea unei clase
    //intr-o clasa putem avea mai multe metode diferentiate prin nume
    //metodele sunt de 2 feluri: void si return
    //void = cea mai des folosita care are ca scop sa execute si sa afiseze informatia
    //return = are ca scop sa execute si sa returneze informatia
    //o metoda poate sau nu sa contina parametrii
    //parametrii se diferentiaza prin numar, nume sau tip

    @Test
    public void metodaTest(){
//        nume="Mirza";
//        prenume="Alexandru";
//        varsta=43;
//        inaltime=1.78;
//        greutate=62.0f;  //f face conversia din double in float
//        sex='M';
//        areRestante=false;

        prezentareCursant("Mirza","Alexandru",43,1.78,62.0f,'M',false);
        prezentareCursant("Popa","Ion",43,1.78,62.0f,'M',false);
        calculMedie(7,8,9,7,8);

        System.out.println(getSalariu());

    }


    public void prezentareCursant(String param1, String param2,Integer param3,
                                  Double param4, Float param5,
                                  Character param6, Boolean param7)
    {

        System.out.println("Numele complet este "+param1+" "+param2);
        System.out.println("Varsta cursantului este "+param3);
        System.out.println("Inaltimea cursantului este "+param4);
        System.out.println("Greutatea cursantului este "+param5);
        System.out.println("Sexul cursantului este "+param6);
        System.out.println("Are cursantul restante ? "+param7);

        nume="Alex";

    }

    //calculam media cursantului


    public void calculMedie(Integer nota1, Integer nota2, Integer nota3, Integer nota4, Integer nota5)
    {
        Integer medie=(nota1+nota2+nota3+nota4+nota5)/5;
        System.out.println("Media cursantului este: "+medie);
        nume="Gabi";
    }

    //exemplu metoda return
    public Integer getSalariu(){
        Integer salariu=2000;
        return salariu;
    }

}

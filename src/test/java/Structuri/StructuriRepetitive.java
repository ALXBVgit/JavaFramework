package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {
    //structuri repetitive = for, while, for each


    @Test
    public void metordaTest(){
        afisamPrimeleNnr(5);
        afisamPrimeleNrWhile(6);
        numerePare();
    }

    //afisam primele 15 numere
    public void afisamPrimeleNnr(Integer capat) {
        for (Integer index = 0; index <= capat; index ++) {
            System.out.println(index);
        }
    }

    //am inlocuit (index = index + 1) cu (index ++) pentru ca este mai rapid/simplu
    //aceeasi metoda cu while
    public void afisamPrimeleNrWhile(Integer capat) {
        Integer index = 0;
        while (index <= capat) {
            System.out.println(index);
            index ++;
        }
    }

    //vreasu sa afisez numerele pare de la 0 la 20
    public void numerePare() {
        for (Integer i = 0; i <= 20; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}

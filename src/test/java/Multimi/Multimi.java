package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {
    //multimi = array, lista, map

    @Test
    public void testMethod() {
//        colegiCursArray();
//        colegiCursList();
//        diferiteGrupe();
        tariOrase();
    }

    //reprezentam multimea colegilor de la curs


    public void colegiCursArray() {
        String[] Colegi = new String[5];
        Colegi[0] = "Coleg1";
        Colegi[1] = "Coleg2";
        Colegi[2] = "Coleg3";
        Colegi[3] = "Coleg4";
        Colegi[4] = "Coleg5";
        for (Integer index = 0; index < Colegi.length; index++) {
            System.out.println(Colegi[index]);
        }
    }

    //exemplu de mai sus cu liste

    public void colegiCursList() {
        List<String> Colegi = new ArrayList<>();
        Colegi.add("ColegA");
        Colegi.add("ColegB");
        Colegi.add("ColegC");
        Colegi.add("ColegD");
        Colegi.add("ColegE");
        for (Integer index = 0; index < Colegi.size(); index++) {
            System.out.println(Colegi.get(index));
        }

    }

    //map => key-value (cheie=fruct, valoare=mar)
    //cheia este unica, valorile pot fi duplicate
    public void diferiteGrupe() {
        Map<String, String> Obiecte = new HashMap<>();
        Obiecte.put("fruct", "mar");
        Obiecte.put("haina", "pantaloni");
        Obiecte.put("instrument", "chitara");
        for (String key : Obiecte.keySet()) {
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea este: " + Obiecte.get(key));
        }
    }

    //reprezentam niste tari cu orasele care le apartain
    public void tariOrase() {
        Map<String, List<String>> Diverse = new HashMap<>();

        List<String> OraseRomania = new ArrayList<>();
        OraseRomania.add("Brasov");
        OraseRomania.add("Sinaia");
        OraseRomania.add("Sibiu");

        List<String> OraseSpania = new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Madrid");
        OraseSpania.add("Alicante");

        List<String> OraseUK = new ArrayList<>();
        OraseUK.add("Londra");
        OraseUK.add("Brighton");
        OraseUK.add("Oxford");

        Diverse.put("Romania", OraseRomania);
        Diverse.put("Spania", OraseSpania);
        Diverse.put("Marea Britanie", OraseUK);


        for (String key : Diverse.keySet()) {
          //  if (key.equals("Marea Britanie")) {
                System.out.println("Tara este: " + key);
                System.out.println("Oresele sunt: " + Diverse.get(key));
           // }
        }
        //tema de reprezentat niste retete de mancare cu ingrediente.
        // cheia: denumirea mancarii, valorile: ingrediente
        //tema + de adaugat sublista, adaug cartiere la orasele de mai sus (tema noua), adica o subcategorie
        //eg pot incepe cu Map<String, Map<String, List<String>>> Diverse2=new HashMap<>();
    }
}

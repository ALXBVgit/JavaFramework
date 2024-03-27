package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemaMultimiOrganigrama {


    @Test

    public void testMethod() {

        organizareGeografica();
    }

    public void organizareGeografica() {
        Map<String, Map<String, List<String>>> OrganigramaTari = new HashMap<>();
        Map<String, List <String>> OrganigramaOraseRO=new HashMap<>();
        Map<String, List <String>> OrganigramaOraseUK=new HashMap<>();

        List<String> CartiereBrasov = new ArrayList<>();
        CartiereBrasov.add("Centru vechi");
        CartiereBrasov.add("Centru civic");
        CartiereBrasov.add("Racadau");
        CartiereBrasov.add("Grivitei");

        List<String> CartiereBucuresti = new ArrayList<>();
        CartiereBucuresti.add("Centru vechi");
        CartiereBucuresti.add("Baneasa");
        CartiereBucuresti.add("Aviatorilor");

        List<String> OraseRomania = new ArrayList<>();
        OraseRomania.add("Brasov");
        OraseRomania.add("Bcuresti");

        List<String> CartiereLondra = new ArrayList<>();
        CartiereLondra.add("City Center");
        CartiereLondra.add("East London");
        CartiereLondra.add("Hyde Park");
        CartiereLondra.add("Chelsea");

        List<String> CartiereOxford = new ArrayList<>();
        CartiereOxford.add("Cowley");
        CartiereOxford.add("Barton");

        List<String> OraseUK = new ArrayList<>();
        OraseUK.add("Londra");
        OraseUK.add("Oxford");

        OrganigramaOraseRO.put("Brasov", CartiereBrasov);
        OrganigramaOraseRO.put("Bucuresti", CartiereBucuresti);

        OrganigramaTari.put("Romania", OrganigramaOraseRO);

        OrganigramaOraseUK.put("Londra", CartiereLondra);
        OrganigramaOraseUK.put("Oxford", CartiereOxford);

        OrganigramaTari.put("Marea Britanie", OrganigramaOraseUK);



        for (String key : OrganigramaTari.keySet()) {
            System.out.println("Tara este: " + key);
            System.out.println("Orasele cu cartiere sunt: " + OrganigramaTari.get(key));
            }


    }

}

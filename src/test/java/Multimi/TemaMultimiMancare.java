package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemaMultimiMancare {

    @Test

    public void testMethod() {
//         listaMeniu();
          meniuRetete();

    }

    public void listaMeniu() {
        List<String> Mancaruri = new ArrayList<>();
        Mancaruri.add("Omleta");
        Mancaruri.add("Supa");
        Mancaruri.add("Ciorba");
        Mancaruri.add("Paste");
        Mancaruri.add("Tort");

        for (Integer index = 0; index < Mancaruri.size(); index++) {
            System.out.println(Mancaruri.get(index));
        }
    }

    public void meniuRetete() {
        Map<String, List<String>> Mancaruri = new HashMap<>();

        List<String> IngredientePizza = new ArrayList<>();
        IngredientePizza.add("lapte");
        IngredientePizza.add("oua");
        IngredientePizza.add("faina");
        IngredientePizza.add("mozarella");
        IngredientePizza.add("sos de rosii");
        IngredientePizza.add("chorizzo");

        List<String> IngredientePasteCarbonara = new ArrayList<>();
        IngredientePasteCarbonara.add("tagliatele");
        IngredientePasteCarbonara.add("guanciale");
        IngredientePasteCarbonara.add("parmezan");
        IngredientePasteCarbonara.add("galbenus de oua");

        Mancaruri.put("Pizza", IngredientePizza);
        Mancaruri.put("Paste Carbonara", IngredientePasteCarbonara);

        for (String key : Mancaruri.keySet()) {
            System.out.println("Mancarea este: " + key);
            System.out.println("Ingredientele sunt" + Mancaruri.get(key));
        }
    }

}
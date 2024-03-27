package Obiect;

import java.util.List;

public class Audi extends Masina {

    private List<String> dotariExterioare;
    private Integer pretFinal;
    public Audi(String marca, String model, String culoare, String carburant,
                Integer an, Integer capacitateCilindrica, Integer pret, List<String> dotariExterioare) {
        super(marca, model, culoare, carburant, an, capacitateCilindrica, pret);
        this.dotariExterioare = dotariExterioare;
    }

    public void prezentareAudi(){
        prezentareMasina();
        calculDotari();
        System.out.println("Pretul final cu extra dotari este " + pretFinal);
        System.out.println("Dotarile exterioare sunt " + dotariExterioare);
    }
    public void calculDotari(){
        pretFinal = getPret();
        for (Integer index = 0; index < dotariExterioare.size(); index++) {
            switch (dotariExterioare.get(index)){
                case "faruri LED":
                    pretFinal += 400;
                    break;
                case "oglinzi electrice":
                    pretFinal += 350;
                    break;
                case  "camera video":
                    pretFinal += 250;  //pretFinal += 250 inlocuieste sintaxa pretFinal = pretFinal + 250;
                    break;

            }
        }
    }

    @Override
    public void pornesteMasina() {
        System.out.println("Audi se porneste de la buton !");
    }
}

